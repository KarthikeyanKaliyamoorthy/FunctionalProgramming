package edu.functional.programming.streams.operations;

import java.util.stream.Stream;

public class ReduceOperation {
    public static void main(String[] args) {
        Integer sum = Stream.of(1, 343, 5454, 445, 5454, 4525, 56, 38, 65, 12, 545)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
