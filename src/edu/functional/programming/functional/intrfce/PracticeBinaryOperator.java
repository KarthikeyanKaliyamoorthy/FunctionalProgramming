package edu.functional.programming.functional.intrfce;

import java.util.function.BinaryOperator;

public class PracticeBinaryOperator {
    public static void main(String[] args) {

        BinaryOperator<String> operator = (a,b) -> a+"."+b;
        System.out.println(operator.apply("google","com"));
    }
}
