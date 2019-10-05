import wso2/mongodb;
import ballerina/io;
import ballerina/http;
import ballerina/log;
import ballerinax/docker;


http:AuthProvider jwtAuthProvider = {
    scheme: http:JWT_AUTH,
    config: {
        issuer:"https://localhost:9443/oauth2/token",
        audience: ["http://org.wso2.apimgt/gateway"],
        certificateAlias: "ballerina",
        trustStore: {
            path: "${ballerina.home}/bre/security/ballerinaTruststore.p12",
            password: "ballerina"
        }
    }
};
listener http:Listener ep = new(9092, config = {
    //authProviders:[jwtAuthProvider],
    //secureSocket: {
    //    keyStore: {
     //       path: "${ballerina.home}/bre/security/ballerinaKeystore.p12",
     //       password: "ballerina"
     //   },
     //   trustStore: {
     //       path: "${ballerina.home}/bre/security/ballerinaTruststore.p12",
     //       password: "ballerina"
     //   }
    //}
});

@docker:Config {
    name: "ajudaai/thread",
    tag: "v1.0"
}

@http:ServiceConfig {
    basePath: "/forum",
    authConfig: {
        authentication: { enabled: true }
    }
}
service threadService on ep {
    @http:ResourceConfig {
        methods: ["GET"],
        path: "/threads",
        authConfig: {
            scopes: ["default"]
        }
    }
    resource function getThreads(http:Caller caller, http:Request req) {
        mongodb:Client conn = new({
            host: "localhost",
            dbName: "testballerina",
            username: "",
            password: "",
            options: { sslEnabled: false, serverSelectionTimeout: 500 }
        });

        json payload = { "descricao": "Teste de thread", "forumId": "1" };

        //var ret = conn->insert("threads", payload);
        //handleInsert(ret, "Insert to threads");
        json|error ret = conn->find("threads", () );
        io:println( ret );

        conn.stop();

        error? result = caller->respond( io:sprintf("%s", ret ) );
        if (result is error) {
            log:printError("Error in responding to caller", err = result);
        }
    }

    @http:ResourceConfig {
        methods: ["POST"],
        path: "/thread",
        authConfig: {
            scopes: ["default"]
        }
    }
    resource function insertThread(http:Caller caller, http:Request req) {
        mongodb:Client conn = new({
            host: "localhost",
            dbName: "testballerina",
            username: "",
            password: "",
            options: { sslEnabled: false, serverSelectionTimeout: 500 }
        });

        json|error payload = req.getJsonPayload();
        io:println("%s", payload);
        json response = {};
        if( payload is json ) {
            json doc = payload;
            var ret = conn->insert("threads", doc );
            if ret is json {
                response = ret;
            }
            handleInsert(ret, "Insert to threads");
        } else {
            io:println("payload is not json");
        }

        conn.stop();

        error? result = caller->respond( io:sprintf("%s", response ) );
        if (result is error) {
            log:printError("Error in responding to caller", err = result);
        }
    }    
}

function handleInsert(()|error returned, string message) {
    if (returned is ()) {
        io:println(message + " success ");
    } else {
        io:println(message + " failed: " + returned.reason());
    }
}

function handleFind(json|error returned) {
    if (returned is json) {
        io:print("initial data:");
        io:println(io:sprintf("%s", returned));
    } else {
        io:println("find failed: " + returned.reason());
    }
}