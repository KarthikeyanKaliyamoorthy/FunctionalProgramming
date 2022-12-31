package edu.functional.programming.design.pattern.fluent;

import edu.functional.programming.composition.Function;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> cart = new ArrayList<>();
    private String address;

    public Order() {
    }

    public Order(List<String> cart, String address) {
        this.cart=cart;
        this.address=address;
    }

    public Order add(String item) {
        cart.add(item);
        System.out.println(item+ " added to the cart");
        return new Order(this.cart,this.address);
    }

    public Order deliverAt(String location) {
        this.address = location;
        System.out.println("The delivery address is "+ location);
        return new Order(this.cart,this.address);
    }

    public static void place(Function<Order, Order> orderFunction){
        Order order = new Order();
        order = orderFunction.apply(order);
        System.out.println("Order placed");
        System.out.println(order.cart.size()+" items order by you wil be delivered at "+ order.address+ "by Tomorrow.");
    }
}
