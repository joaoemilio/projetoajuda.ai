import wso2/mongodb;
import ballerina/io;
import ballerina/http;
import ballerina/log;
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
    secureSocket: {
        keyStore: {
            path: "${ballerina.home}/bre/security/ballerinaKeystore.p12",
            password: "ballerina"
        },
        trustStore: {
            path: "${ballerina.home}/bre/security/ballerinaTruststore.p12",
            password: "ballerina"
        }
    }
});@http:ServiceConfig {
    basePath: "/clinic",
    authConfig: {
        authentication: { enabled: true }
    }
}
service echo on ep {
    @http:ResourceConfig {
        methods: ["GET"],
        path: "/vets",
        authConfig: {
            scopes: ["default"]
        }
    }
    resource function hello(http:Caller caller, http:Request req) {
        mongodb:Client conn = new({
            host: "localhost",
            dbName: "testballerina",
            username: "",
            password: "",
            options: { sslEnabled: false, serverSelectionTimeout: 500 }
        });

        json doc1 = { "name": "ballerina", "type": "src" };
        json doc2 = { "name": "connectors", "type": "artifacts" };
        json doc3 = { "name": "docerina", "type": "src" };
        json doc4 = { "name": "test", "type": "artifacts" };
        json filter = { "type": "src" };
        json replaceFilter = { "type": "artifacts" };

        var ret = conn->insert("projects", doc1);
        handleInsert(ret, "Insert to projects");
        ret = conn->insert("projects", doc2);
        handleInsert(ret, "Insert to projects");
        ret = conn->insert("projects", doc3);
        handleInsert(ret, "Insert to projects");

        var jsonRet = conn->find("projects", ());
        handleFind(jsonRet);

        json queryString = { "name": "ballerina" };
        jsonRet = conn->find("projects", queryString);
        handleFind(jsonRet);

        jsonRet = conn->findOne("projects", queryString);
        handleFind(jsonRet);

        var deleteRet = conn->delete("projects", filter, true);
        if (deleteRet is int) {
            io:println("deleted count: " + deleteRet);
        } else {
            io:println("delete failed: " + deleteRet.reason());
        }

        json doc5 = { "name": "main", "type": "artifacts" };
        var response = conn->replaceOne("projects", replaceFilter, doc5);
        if (response is int) {
            io:println("Modified count: " + response);
        } else {
            io:println("Modified count: " + response.reason());
        }
        conn.stop();
        json _responseJson = {
                resultado: "Alo Galera do SouJava / Java@Rio meetup"
            };
        error? result = caller->respond( _responseJson );
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