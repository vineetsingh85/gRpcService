package org.grpc.user.generated;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.grpc.auto.generated.stubs.HelloRequest;
import org.grpc.auto.generated.stubs.HelloResponse;
import org.grpc.auto.generated.stubs.HelloServiceGrpc;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub
                = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                .setFirstName("Baeldung")
                .setLastName("gRPC")
                .build());
        System.out.println(helloResponse.getGreeting() + "......");

        channel.shutdown();
    }
}
