package com.prog.pattern.example.correct.impl.v5.lunch;

public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String make() {
        return super.make() + addMeat();
    }

    private String addMeat() {
        return " with meat";
    }
}
