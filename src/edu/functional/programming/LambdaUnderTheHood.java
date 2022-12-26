package edu.functional.programming;

public class LambdaUnderTheHood {
    public static void main(String[] args) {
        /*MyFunctionalInterface functionalInterface = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.printf("Impl1");
            }
        };
        MyFunctionalInterface functionalInterface1 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.printf("Impl2");
            }
        };*/
        MyFunctionalInterface fun1 = () -> System.out.println("impl1");
        MyFunctionalInterface fun2 = () -> System.out.println("impl2");
    }
}
