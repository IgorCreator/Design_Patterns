package com.prog.pattern.example.correct.impl.v1.test.pizza;

import com.prog.pattern.example.correct.impl.v1.test.pizza.creators.ChicagoStylePizzaStore;
import com.prog.pattern.example.correct.impl.v1.test.pizza.creators.NYStylePizzaStore;
import com.prog.pattern.example.correct.impl.v1.test.pizza.creators.PizzaStore;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.Order;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.Pizza;

public class PizzaOrderProcessor {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Order order = new Order("cheese", Order.DeliveryType.PICK_UP);

        Pizza pizzaNYStyle = nyStore.orderPizza(order);
        System.out.println(pizzaNYStyle.getName() + "\n");

        Pizza pizzaChicagoStyle = chicagoStore.orderPizza(order);
        System.out.println(pizzaChicagoStyle.getName() + "\n");
    }

}
