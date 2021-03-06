import wso2/mongodb;
import ballerina/io;
import ballerina/http;
import ballerina/log;
import ballerinax/docker;
import ballerina/system;


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
        methods: ["GET"],
        path: "/thread/{threadId}/messages",
        authConfig: {
            scopes: ["default"]
        }
    }
    resource function getThreadMessages(http:Caller caller, http:Request req, string threadId) {
        mongodb:Client conn = new({
            host: "localhost",
            dbName: "testballerina",
            username: "",
            password: "",
            options: { sslEnabled: false, serverSelectionTimeout: 500 }
        });

        io:println( "threadid: " + threadId );

        json queryString = { "threadId": threadId };
        io:println("queryString " + io:sprintf("%s", queryString) );

        json|error ret = conn->find("messages", queryString );
        io:println( ret );

        conn.stop();

        error? result = caller->respond( io:sprintf("%s", ret ) );
        if (result is error) {
            log:printError("Error in responding to caller", err = result);
        }
    }

    @http:ResourceConfig {
        methods: ["GET"],
        path: "/thread/{threadId}",
        authConfig: {
            scopes: ["default"]
        }
    }
    resource function getThread(http:Caller caller, http:Request req, string threadId) {
        mongodb:Client conn = new({
            host: "localhost",
            dbName: "testballerina",
            username: "",
            password: "",
            options: { sslEnabled: false, serverSelectionTimeout: 500 }
        });

        io:println( "threadid: " + threadId );

        json queryString = { "id": threadId };
        io:println("queryString " + io:sprintf("%s", queryString) );

        json|error ret = conn->findOne("threads", queryString );
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
            doc.id = system:uuid();
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

    @http:ResourceConfig {
        methods: ["POST"],
        path: "/message",
        authConfig: {
            scopes: ["default"]
        }
    }
    resource function insertMessage(http:Caller caller, http:Request req) {
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
            var ret = conn->insert("messages", doc );
            if ret is json {
                response = ret;
            }
            handleInsert(ret, "Insert to messages");
        } else {
            io:println("payload is not json");
        }

        conn.stop();

        error? result = caller->respond( io:sprintf("%s", response ) );
        if (result is error) {
            log:printError("Error in responding to caller", err = result);
        }
    }  

    @http:ResourceConfig {
        methods: ["GET"],
        path: "/messages",
        authConfig: {
            scopes: ["default"]
        }
    }
    resource function getMessages(http:Caller caller, http:Request req) {
        mongodb:Client conn = new({
            host: "localhost",
            dbName: "testballerina",
            username: "",
            password: "",
            options: { sslEnabled: false, serverSelectionTimeout: 500 }
        });

        json|error ret = conn->find("messages", () );
        io:println( ret );

        conn.stop();

        error? result = caller->respond( io:sprintf("%s", ret ) );
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