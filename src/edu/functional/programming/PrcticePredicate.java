package edu.functional.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrcticePredicate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("");
        list.add("String");
        list.add("");

        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> nonEmptys = filterList(list, predicate);
        System.out.println(nonEmptys);

    }

    private static List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> newList = new ArrayList<>();

        for (String string:list) {
            if (predicate.test(string))
                newList.add(string);
        }
        return newList;
    }
}
