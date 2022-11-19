package com.example.javarestserver.model;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HelloRequest {

    private String name;
    private List<String> hobbies;

}
