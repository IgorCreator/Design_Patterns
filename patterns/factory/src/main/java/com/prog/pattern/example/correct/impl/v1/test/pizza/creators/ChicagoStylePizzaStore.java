package com.prog.pattern.example.correct.impl.v1.test.pizza.creators;

import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.Pizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.chicago.ChicagoStyleCheesePizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.chicago.ChicagoStyleClamPizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.chicago.ChicagoStylePepperoniPizza;
import com.prog.pattern.example.correct.impl.v1.test.pizza.pojo.store.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
