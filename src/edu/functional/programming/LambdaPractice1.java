package edu.functional.programming;

public class LambdaPractice1 {
    public static void main(String[] args) {
        Name name = () -> System.out.println("My Method");
        name.myName();
    }
}
