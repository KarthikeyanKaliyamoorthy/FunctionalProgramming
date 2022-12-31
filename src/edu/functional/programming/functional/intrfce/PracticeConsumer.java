package edu.functional.programming.functional.intrfce;

import java.util.List;
import java.util.function.Consumer;

public class PracticeConsumer {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,3,4,5,6,89);
        Consumer<Integer> printer = System.out::println;//existingObject::instanceMethod
        printElements(list,printer);
    }

    private static <T> void printElements(List<T> list, Consumer<T> printer) {
        for (T t:list) {
            printer.accept(t);
        }
    }
}
