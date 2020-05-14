package com.prog.pattern.example.correct.impl.v5.lunch;

public abstract class SandwichDecorator implements Sandwich {

    protected  Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return sandwich.make();
    }
}
