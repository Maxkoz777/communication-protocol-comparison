package com.example.javarestserver.service;

import com.example.javarestserver.model.HelloRequest;
import com.example.javarestserver.model.HelloResponse;

public interface GreetingService {

    HelloResponse getHelloResponse(HelloRequest request);

}
