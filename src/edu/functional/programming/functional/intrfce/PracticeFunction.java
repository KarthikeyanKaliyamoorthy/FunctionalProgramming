package edu.functional.programming.functional.intrfce;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PracticeFunction {

    public static void main(String[] args) {
        List<String> list = List.of("choco","mango","papaya");
        Function<String, Integer> function = String :: length;//Class::instanceMethod

        List<Integer> integerList = map(list, function);
        System.out.println(integerList);
    }

    private static <T,R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> lengths = new ArrayList<>();
        for (T t:list) {
            lengths.add(function.apply(t));
        }
        return lengths;
    }
}
