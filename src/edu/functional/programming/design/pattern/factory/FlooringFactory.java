package edu.functional.programming.design.pattern.factory;

import java.util.function.Supplier;

public class FlooringFactory {

    public static Flooring getFlooring(int minTemp, int maxTemp) {
        Supplier<Flooring> flooring;

        if(minTemp<=-5 && maxTemp <=20)
            flooring = () -> new WoodenFlooring();
        else if (minTemp<=20 && maxTemp <=40)
            flooring = () -> new ConcreteFlooring();
        else
            flooring = () -> new CorkFlooring();

        return flooring.get();
    }
}
