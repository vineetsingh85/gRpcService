package org.grpc.user.generated;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8082)
                .addService(new HelloServiceImpl()).build();

        server.start();
        server.awaitTermination();
        System.out.println("Server started.......");
    }
}