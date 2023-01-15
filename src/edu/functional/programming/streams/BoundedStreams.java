package edu.functional.programming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class BoundedStreams {
    public static void main(String[] args) {
        //1. of()
        Stream<String> stringStream = Stream.of("Hi", "test", "robooot");

        //2. stream() on collection
        List<Integer> list = List.of(1,4,56,78);
        Stream<Integer> stream = list.stream();

        Map<Integer, String> map = Map.of(1,"one",2,"two",3,"three");
        Stream<Map.Entry<Integer, String>> stream1 = map.entrySet().stream();

        Stream<String> values = map.values().stream();
        Stream<Integer> keySet = map.keySet().stream();

        //3. Arrays.stream()
        int [] numbers ={3,4,6,72};
        Arrays.stream(numbers);

        //4. using builder pattern

        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(1);
        //some logic
        builder.add(23);
        builder.build();

    }
}
