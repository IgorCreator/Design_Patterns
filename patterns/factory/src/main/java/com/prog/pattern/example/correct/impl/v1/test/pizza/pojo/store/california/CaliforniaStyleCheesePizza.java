package com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.california;

import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.Pizza;

public class CaliforniaStyleCheesePizza  extends Pizza {

    public CaliforniaStyleCheesePizza() {
        name = "California Style Dish Cheese Pizza";
        dough = "Extra Thin Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Blue Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into 6 slices");
    }
}
