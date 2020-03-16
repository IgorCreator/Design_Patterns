package com.prog.pattern.example.correct.impl.v1.gumball.app.state;

import java.io.Serializable;

public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void refill();
}
