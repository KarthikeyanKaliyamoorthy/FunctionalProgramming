package edu.functional.programming.streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfinteStreams {
    public static void main(String[] args) {
        IntStream.iterate(0, i -> i+1)
                .limit(15)
                .forEach(System.out::println);

        Stream.generate(() -> new Random().nextInt())
                .forEach(System.out::println);
    }
}
