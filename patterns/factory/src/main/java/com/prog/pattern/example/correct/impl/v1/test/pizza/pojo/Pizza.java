package com.prog.pattern.example.correct.impl.v1.test.pizza.pojo;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        toppings.forEach(System.out::println);
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void deliver(Order.DeliveryType type) {
        if (type.equals(Order.DeliveryType.RESTARAUNT))
            System.out.println("Place pizza in official PizzaStore plate, and serve hot");
        else
            System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}
