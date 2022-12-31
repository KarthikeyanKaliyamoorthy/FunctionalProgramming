package edu.functional.programming.design.pattern.fluent;

public class FluentPattern {
    public static void main(String[] args) {

       Order.place(order -> order.add("Shoes")
               .add("Head pones")
               .deliverAt("No:5, Chennai")
       );
    }
}
