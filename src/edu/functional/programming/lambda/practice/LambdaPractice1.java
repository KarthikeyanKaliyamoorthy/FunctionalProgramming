package edu.functional.programming.lambda.practice;

import edu.functional.programming.functional.intrfce.Name;

public class LambdaPractice1 {
    public static void main(String[] args) {
        Name name = () -> System.out.println("My Method");
        name.myName();
    }
}
