package edu.functional.programming.reference;

import java.util.function.BiFunction;

public class StaticReference {
    public static void main(String[] args) {
        BiFunction<String,String,String> biFunction = A_Class :: staticMethod ; //Class::staticMethod
        System.out.println(biFunction.apply("Asu",  "run"));
    }
}

class A_Class {

    public static String staticMethod(String s, String s1) {
        return s+s1;
    }
}
