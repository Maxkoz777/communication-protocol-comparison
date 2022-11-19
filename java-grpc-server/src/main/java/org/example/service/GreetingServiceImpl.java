package org.example.service;

import com.example.grpc.GreetingServiceOuterClass;
import com.example.grpc.GreetingServiceOuterClass.HelloRequest;
import com.example.grpc.GreetingServiceOuterClass.HelloResponse;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends com.example.grpc.GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void greeting(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println("Processing request: " + request);
        GreetingServiceOuterClass.HelloResponse response = GreetingServiceOuterClass.HelloResponse.newBuilder()
            .setGreeting("Hello from grpc server, " + request.getName())
            .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
