package com.example.javarestserver.service.impl;

import com.example.javarestserver.model.EnormousDTO;
import com.example.javarestserver.model.HelloRequest;
import com.example.javarestserver.model.HelloResponse;
import com.example.javarestserver.service.RestService;
import com.github.javafaker.Faker;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;

@Service
public class RestServiceImpl implements RestService {

    @Override
    public HelloResponse getHelloResponse(HelloRequest request) {
        return HelloResponse.builder()
            .greeting("Hello from REST server, " + request.getName())
            .build();
    }

    @Override
    public HelloResponse getHeavyLoadedHelloResponse(HelloRequest request) {
        factorialHavingLargeResult(52311);
        return getHelloResponse(request);
    }

    @Override
    public List<EnormousDTO> getEnormousDTOList() {
        List<EnormousDTO> resultList = new ArrayList<>();
        for (int i = 0; i < 4000; i++) {
            resultList.add(getSingleEnormousDto());
        }
        return resultList;
    }

    @Override
    public EnormousDTO getSingleEnormousDto() {
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
        return EnormousDTO.builder()
            .booleans(booleans)
            .strings(strings)
            .doubles(doubles)
            .longs(longs)
            .build();
    }

    private BigInteger factorialHavingLargeResult(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}
