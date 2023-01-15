package edu.functional.programming.streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Calculation {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,45,6);
        int [] numbers = {1,3,4,5,67,89};

        OptionalInt min = IntStream.of(numbers).min();
        System.out.println(min.getAsInt());

        OptionalInt max = IntStream.of(numbers).max();
        System.out.println(max.getAsInt());

        int sum = IntStream.of(numbers).sum();
        System.out.println(sum);

        OptionalDouble average = IntStream.of(numbers).average();
        System.out.println(average.getAsDouble());

        IntSummaryStatistics summaryStatistics = IntStream.of(numbers).summaryStatistics();
        System.out.println(summaryStatistics);

    }
}
