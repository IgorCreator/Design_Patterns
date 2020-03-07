package com.prog.pattern.example.correct.impl.v2.test.simple;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void refill();
}
