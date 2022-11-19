package com.example.javarestserver.service.impl;

import com.example.javarestserver.model.HelloRequest;
import com.example.javarestserver.model.HelloResponse;
import com.example.javarestserver.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl  implements GreetingService {

    @Override
    public HelloResponse getHelloResponse(HelloRequest request) {
        return HelloResponse.builder()
            .greeting("Hello from REST server, " + request.getName())
            .build();
    }

}
