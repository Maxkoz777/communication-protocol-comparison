package com.example.javarestserver.service;

import com.example.javarestserver.model.EnormousDTO;
import com.example.javarestserver.model.HelloRequest;
import com.example.javarestserver.model.HelloResponse;
import java.util.List;

public interface RestService {

    HelloResponse getHelloResponse(HelloRequest request);

    HelloResponse getHeavyLoadedHelloResponse(HelloRequest request);

    List<EnormousDTO> getEnormousDTOList();

    EnormousDTO getSingleEnormousDto();

}
