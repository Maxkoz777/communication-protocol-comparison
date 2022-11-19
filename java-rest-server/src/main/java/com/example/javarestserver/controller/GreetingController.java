package com.example.javarestserver.controller;

import com.example.javarestserver.model.HelloRequest;
import com.example.javarestserver.model.HelloResponse;
import com.example.javarestserver.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    @PostMapping
    ResponseEntity<HelloResponse> getHelloResponse(@RequestBody HelloRequest request) {
        return ResponseEntity.ok(greetingService.getHelloResponse(request));
    }

}
