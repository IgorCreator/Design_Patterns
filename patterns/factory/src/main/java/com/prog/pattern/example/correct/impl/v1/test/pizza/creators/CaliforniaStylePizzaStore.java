package com.prog.pattern.example.correct.impl.v1.test.pizza.creators;

import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.Pizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.california.CaliforniaStyleCheesePizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.california.CaliforniaStyleClamPizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.california.CaliforniaStylePepperoniPizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.california.CaliforniaStyleVeggiePizza;

public class CaliforniaStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            pizza = new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new CaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")){
            pizza = new CaliforniaStyleVeggiePizza();
        }
        return pizza;
    }
    
}
