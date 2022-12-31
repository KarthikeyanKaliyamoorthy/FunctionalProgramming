package edu.functional.programming.design.pattern.factory;

public class ConcreteFlooring implements Flooring{
    @Override
    public void installation() {
        System.out.println("Concrete floor installed");
    }
}
