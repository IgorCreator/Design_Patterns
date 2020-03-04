package com.prog.pattern.example.correct.impl.v2.pizza.pojo.store;

import com.prog.pattern.example.correct.impl.v2.pizza.pojo.base.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
