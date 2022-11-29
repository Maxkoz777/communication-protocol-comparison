package com.example.javarestserver.controller;

import com.example.javarestserver.model.EnormousDTO;
import com.example.javarestserver.model.HelloRequest;
import com.example.javarestserver.model.HelloResponse;
import com.example.javarestserver.service.RestService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RestController {

    private final RestService greetingService;

    @PostMapping("/greeting")
    ResponseEntity<HelloResponse> getHelloResponse(@RequestBody HelloRequest request) {
        return ResponseEntity.ok(greetingService.getHelloResponse(request));
    }

    @PostMapping("/long")
    ResponseEntity<HelloResponse> getHeavyResponse(@RequestBody HelloRequest request) {
        return ResponseEntity.ok(greetingService.getHeavyLoadedHelloResponse(request));
    }

    @PostMapping("/heavy/list")
    ResponseEntity<List<EnormousDTO>> getHeavyListResponse(@RequestBody EnormousDTO request) {
        return ResponseEntity.ok(greetingService.getEnormousDTOList());
    }

    @PostMapping("/heavy")
    ResponseEntity<EnormousDTO> getHeavyResponse(@RequestBody EnormousDTO request) {
        return ResponseEntity.ok(greetingService.getSingleEnormousDto());
    }

}
