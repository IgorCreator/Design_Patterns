package com.prog.pattern.example.correct.impl.v2.pizza.pojo.store.california;

import com.prog.pattern.example.correct.impl.v2.pizza.pojo.base.*;
import com.prog.pattern.example.correct.impl.v2.pizza.pojo.store.PizzaIngredientFactory;
import com.prog.pattern.example.correct.impl.v2.pizza.pojo.store.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        
        PizzaIngredientFactory ingredientFactory =
                new CaliforniaPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("California Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("California Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("California Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("California Style Pepperoni Pizza");
        }
        return pizza;
    }
}
