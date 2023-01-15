package edu.functional.programming.streams.operations;

import java.util.stream.Stream;

public class FilterOperation {
    public static void main(String[] args) {
        Stream.of(1,343,5454,445,5454,4525,56,38,65,12,545)
                .filter(i -> i%2 ==0)
                .forEach(System.out::println);

    }
}
