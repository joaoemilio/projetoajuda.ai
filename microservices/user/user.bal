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
listener http:Listener ep = new(9093, config = {
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
    basePath: "/",
    authConfig: {
        authentication: { enabled: true }
    }
}
service userService on ep {

    @http:ResourceConfig {
        methods: ["POST"],
        path: "/user",
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
            var ret = conn->insert("users", doc );
            if ret is json {
                response = ret;
            }
            handleInsert(ret, "Insert to users");
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
        path: "/user/{userId}",
        authConfig: {
            scopes: ["default"]
        }
    }
    resource function getUser(http:Caller caller, http:Request req, string userId) {
        mongodb:Client conn = new({
            host: "localhost",
            dbName: "testballerina",
            username: "",
            password: "",
            options: { sslEnabled: false, serverSelectionTimeout: 500 }
        });

        io:println( "userId: " + userId );

        json queryString = { "id": userId };
        io:println("queryString " + io:sprintf("%s", queryString) );

        json|error ret = conn->findOne("users", queryString );
        io:println( ret );

        conn.stop();

        error? result = caller->respond( io:sprintf("%s", ret ) );
        if (result is error) {
            log:printError("Error in responding to caller", err = result);
        }
    }

    @http:ResourceConfig {
        methods: ["GET"],
        path: "/user",
        authConfig: {
            scopes: ["default"]
        }
    }
    resource function getUserByEmail(http:Caller caller, http:Request req) {
        mongodb:Client conn = new({
            host: "localhost",
            dbName: "testballerina",
            username: "",
            password: "",
            options: { sslEnabled: false, serverSelectionTimeout: 500 }
        });

        var params = req.getQueryParams();
        var email = <string>params.email;

        io:println( "email: " + email );

        json queryString = { "email": email };
        io:println("queryString " + io:sprintf("%s", queryString) );

        json|error ret = conn->findOne("users", queryString );
        io:println( ret );

        conn.stop();

        error? result = caller->respond( io:sprintf("%s", ret ) );
        if (result is error) {
            log:printError("Error in responding to caller", err = result);
        }
    }

    @http:ResourceConfig {
        methods: ["GET"],
        path: "/users",
        authConfig: {
            scopes: ["default"]
        }
    }
    resource function getUsers(http:Caller caller, http:Request req) {
        mongodb:Client conn = new({
            host: "localhost",
            dbName: "testballerina",
            username: "",
            password: "",
            options: { sslEnabled: false, serverSelectionTimeout: 500 }
        });

        json|error ret = conn->find("users", () );
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