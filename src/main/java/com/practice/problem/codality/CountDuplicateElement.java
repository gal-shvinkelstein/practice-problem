package com.practice.problem.codality;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateElement {
    public static int countNonUnique(List<Integer> numbers) {
        return (int) numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .count();
    }
}
