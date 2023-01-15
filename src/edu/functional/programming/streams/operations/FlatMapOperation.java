package edu.functional.programming.streams.operations;

import java.util.stream.Stream;

public class FlatMapOperation {
    public static void main(String[] args) {
        Stream<String> a = Stream.of("h","i");
        Stream<String> b = Stream.of("there","!!");
        Stream<Stream<String>> ab = Stream.of(a, b);

        Stream<String> flatMap = Stream.of(a, b).flatMap(e -> e);
        flatMap.forEach(System.out::println);
    }
}
