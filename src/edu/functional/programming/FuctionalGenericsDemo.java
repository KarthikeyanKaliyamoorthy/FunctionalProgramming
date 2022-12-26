package edu.functional.programming;

public class FuctionalGenericsDemo {
    public static void main(String[] args) {
        FunctionalGenerics<String,Integer> fun = s -> s.length();
        System.out.println(fun.execute("Rassssssssaaa"));

        FunctionalGenerics<String,String> fun1 = s -> s.substring(3);
        System.out.println(fun1.execute("Rassssssssaaa"));
    }
}
