package org.example.service;

import com.example.grpc.GreetingServiceOuterClass;
import com.example.grpc.GreetingServiceOuterClass.EnormousDTO;
import com.example.grpc.GreetingServiceOuterClass.HelloRequest;
import com.example.grpc.GreetingServiceOuterClass.HelloResponse;
import com.github.javafaker.Faker;
import io.grpc.stub.StreamObserver;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

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

    @Override
    public void longComputation(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println("Heavy computation started");
        factorialHavingLargeResult(52311);
        System.out.println("Heavy computation completed");
        GreetingServiceOuterClass.HelloResponse response = GreetingServiceOuterClass.HelloResponse.newBuilder()
            .setGreeting("Hello from grpc server, " + request.getName())
            .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void heavyPayload(EnormousDTO request, StreamObserver<EnormousDTO> responseObserver) {
        System.out.println("Heavy response creation");
        responseObserver.onNext(generateHeavyResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void heavyPayloadList(EnormousDTO request, StreamObserver<EnormousDTO> responseObserver) {
        System.out.println("Heavy response list creation");
        for (int i = 0; i < 4000; i++) {
            responseObserver.onNext(generateHeavyResponse());
        }
        System.out.println("Heavy response list with 4000 instances created");
        responseObserver.onCompleted();
    }

    private BigInteger factorialHavingLargeResult(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    private EnormousDTO generateHeavyResponse() {
        Faker faker = new Faker();
        Random random = new Random();
        List<String> strings = new ArrayList<>();
        List<Long> longs = new ArrayList<>();
        List<Boolean> booleans = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        IntStream.rangeClosed(1, 100).forEach(x -> {
            strings.add(faker.name().fullName());
            longs.add(random.nextLong());
            booleans.add(faker.bool().bool());
            doubles.add(random.nextDouble());
        });
        return GreetingServiceOuterClass.EnormousDTO.newBuilder()
            .addAllStrings(strings)
            .addAllBooleans(booleans)
            .addAllLongs(longs)
            .addAllDoubles(doubles)
            .build();
    }
}
