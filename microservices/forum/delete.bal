import wso2/mongodb;
import ballerina/io;
import ballerina/http;
import ballerina/log;

listener http:Listener ep = new(9092, config = {
});

@http:ServiceConfig {
    basePath: "/mongo"
}
service echo on ep {
    @http:ResourceConfig {
        methods: ["DELETE"],
        path: "/threads"
    }
    resource function deleteThreads(http:Caller caller, http:Request req) {
        mongodb:Client conn = new({
            host: "localhost",
            dbName: "testballerina",
            username: "",
            password: "",
            options: { sslEnabled: false, serverSelectionTimeout: 500 }
        });

        var deleteRet = conn->delete("threads", true);
        if (deleteRet is int) {
            io:println("deleted count: " + deleteRet);
        } else {
            io:println("delete failed: " + deleteRet.reason());
        }
        conn.stop();

        error? result = caller->respond( "{ 'status': 'ok' }" );
        if (result is error) {
            log:printError("Error in responding to caller", err = result);
        }
    }
}