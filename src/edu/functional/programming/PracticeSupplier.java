package edu.functional.programming;

import java.util.function.Supplier;

public class PracticeSupplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "A String";

        System.out.println(supplier.get());

        Supplier<Double> randomNumber = Math::random;//Class::staticMethod
        System.out.println(randomNumber.get());
    }
}
