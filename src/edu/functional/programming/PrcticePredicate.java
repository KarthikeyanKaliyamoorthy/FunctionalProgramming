package edu.functional.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrcticePredicate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");
        list.add("BasicsStrong");

        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> nonEmptys = filterList(list, predicate);
        System.out.println(nonEmptys);

        Predicate<String> filter = s -> s.contains("Basics");
        List<String> filterList = filterList(list, filter);
        System.out.println(filterList);

        List<Integer> intLists = List.of(1,3,4,6,8,19,10);
        Predicate<Integer> evenFilter = e -> e %2 ==0;
        List<Integer> evens = filterList(intLists, evenFilter);
        System.out.println(evens);

    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();

        for (T string:list) {
            if (predicate.test(string))
                newList.add(string);
        }
        return newList;
    }
}
