package com.prog.pattern.example.correct.impl.v1.test.pizza.creators;

import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.Pizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.ny.NYStyleCheesePizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.ny.NYStyleClamPizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.ny.NYStylePepperoniPizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.ny.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
