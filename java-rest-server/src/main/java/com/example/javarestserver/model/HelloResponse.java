package com.example.javarestserver.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HelloResponse {

    private String greeting;

}
