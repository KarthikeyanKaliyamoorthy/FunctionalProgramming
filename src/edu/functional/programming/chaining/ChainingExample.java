package edu.functional.programming.chaining;

import java.util.function.Function;

public class ChainingExample {

    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> i+2;
        Function<Integer, Integer> f2 = i -> i*2;

        Function<Integer, Integer> f3 = f1.andThen(f2);
        System.out.println(f3.apply(10));
    }
}
