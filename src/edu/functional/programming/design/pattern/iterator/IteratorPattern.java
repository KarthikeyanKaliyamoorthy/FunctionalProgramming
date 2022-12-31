package edu.functional.programming.design.pattern.iterator;

public class IteratorPattern {
    public static void main(String[] args) {
        Object[] array = new Object[]{1,4,5,6,7};

        MyArrayList list = new MyArrayList(array);
        list.forEach(System.out::println);
    }
}
