package edu.functional.programming.design.pattern.decorator;

public class Burger {
    private String burgerType;
    public Burger(){
        this.burgerType ="";
    }

    private Burger(String burgerType) {
        this.burgerType = burgerType;
    }

    public Burger addVeggies() {
        System.out.println("Adding Veggies to the burger");
        return new Burger(this.burgerType += " Veggie");
    }

    public Burger addCheese() {
        System.out.println("Adding Cheese to the burger");
        return new Burger(this.burgerType += " Cheese");
    }

    @Override
    public String toString() {
        return String.format("%s",burgerType+" burger");
    }
}
