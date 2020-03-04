package com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.california;

import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.Pizza;

public class CaliforniaStyleClamPizza extends Pizza {

    public CaliforniaStyleClamPizza() {
        name = "California Style Dish Cheese Pizza";
        dough = "Extra Thin Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Blue Cheese");
        toppings.add("Frozen Clams from Back Bay");
    }

    public void cut() {
        System.out.println("Cutting the pizza into 6 slices");
    }
}
