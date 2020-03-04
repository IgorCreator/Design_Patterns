package com.prog.pattern.example.correct.impl.v2.pizza.pojo.store.california;

import com.prog.pattern.example.correct.impl.v2.pizza.pojo.ingredients.*;
import com.prog.pattern.example.correct.impl.v2.pizza.pojo.store.PizzaIngredientFactory;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new VeryThinDough();
    }
    public Sauce createSauce() {
        return new BruschettaSauce();
    }
    public Cheese createCheese() {
        return new GoatCheese();
    }
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new Calamari()};
        return veggies;
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public Clams createClam() {
        return new FreshClams();
    }
}
