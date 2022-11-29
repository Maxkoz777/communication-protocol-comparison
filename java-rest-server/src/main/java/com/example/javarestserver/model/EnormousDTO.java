package com.example.javarestserver.model;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EnormousDTO {
    private List<String> strings;
    private List<Long> longs;
    private List<Double> doubles;
    private List<Boolean> booleans;
}
