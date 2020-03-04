package com.prog.pattern.example.incorrect.impl.v2;

public class Espresso extends Beverage {
    public double cost() {
        return 10.5 + super.cost();
    }
}
