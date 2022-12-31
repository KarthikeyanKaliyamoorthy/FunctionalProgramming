package edu.functional.programming.currying;

import edu.functional.programming.composition.Function;

public class CurryingExample {
    public static void main(String[] args) {
        Function<Integer, Function<Integer,Integer>> fun1 = t -> u -> t+u;
        Function<Integer, Integer> fun2 = fun1.apply(1);
        Integer sum = fun2.apply(4);
        System.out.println(sum);
    }
}
