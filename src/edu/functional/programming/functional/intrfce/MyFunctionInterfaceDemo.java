package edu.functional.programming.functional.intrfce;

public class MyFunctionInterfaceDemo {
    public static void main(String[] args) {

//        MyFunctionalInterface myFunction = () -> System.out.println("Hello");
//        myFunction.myMethod();
        onTheFly(() -> System.out.println("Hello on the Fly"));
    }

    public static void onTheFly(MyFunctionalInterface myFunction){
        myFunction.myMethod();
    }
}