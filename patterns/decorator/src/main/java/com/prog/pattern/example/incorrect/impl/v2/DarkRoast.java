package com.prog.pattern.example.incorrect.impl.v2;

public class DarkRoast extends Beverage {
    public double cost() {
        return 12 + super.cost();
    }
}
