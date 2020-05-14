package com.prog.pattern.example.correct.impl.v5.lunch;

public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String make() {
        return super.make() + addDressing();
    }

    private String addDressing() {
        return " with mustard";
    }
}
