package edu.functional.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class PracticeUnaryOperator {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,2,44,56,89);
        UnaryOperator<Integer> operator = e -> e*1000;

        List<Integer> opList = mapper(list, operator);
        System.out.println(opList);

    }

    private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator) {
        List<T> intList = new ArrayList<>();
        for (T t:list) {
            intList.add(operator.apply(t));
        }
        return intList;
    }
}
