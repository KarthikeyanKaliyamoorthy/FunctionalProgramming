package edu.functional.programming.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreams {
    public static void main(String[] args) {
        OptionalDouble averageBookRating = BooksRepository.getBooks().stream()
                .mapToDouble(book -> book.getRating())
                .average();
        System.out.println(averageBookRating.getAsDouble());

        //map : Objects
        //mapToDouble : primitive double

        IntStream intStream = IntStream.of(1,3,4,56,7);
        DoubleStream doubleStream = DoubleStream.of(3.6,4.7,67.0);
        LongStream longStream = LongStream.of(3L,565656L);

    }
}
