package com.prog.pattern.example.correct.impl.v2.pizza;

import com.prog.pattern.example.correct.impl.v2.pizza.pojo.base.Pizza;
import com.prog.pattern.example.correct.impl.v2.pizza.pojo.store.PizzaStore;
import com.prog.pattern.example.correct.impl.v2.pizza.pojo.store.chicago.ChicagoPizzaStore;
import com.prog.pattern.example.correct.impl.v2.pizza.pojo.store.ny.NYPizzaStore;

public class PizzaOrderProcess {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
