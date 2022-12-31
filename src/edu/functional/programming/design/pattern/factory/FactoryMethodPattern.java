package edu.functional.programming.design.pattern.factory;

public class FactoryMethodPattern {
    public static void main(String[] args) {

        Flooring flooring = FlooringFactory.getFlooring(-5,13);
        flooring.installation();
    }
}
