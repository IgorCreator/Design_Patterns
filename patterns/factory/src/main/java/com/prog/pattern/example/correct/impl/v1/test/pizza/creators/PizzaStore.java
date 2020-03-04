package com.prog.pattern.example.correct.impl.v1.test.pizza.creators;

import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.Order;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.Pizza;

public abstract class PizzaStore {
    protected Pizza pizza;

    public Pizza orderPizza(Order order){

        pizza = createPizza(order.getPizzaChar());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.deliver(order.getDeliveryType());

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
