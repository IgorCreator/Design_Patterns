package com.prog.pattern.example.correct.impl.v2.pizza.pojo.store;

import com.prog.pattern.example.correct.impl.v2.pizza.pojo.ingredients.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
