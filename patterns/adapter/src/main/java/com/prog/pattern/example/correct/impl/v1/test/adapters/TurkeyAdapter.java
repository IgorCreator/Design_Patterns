package com.prog.pattern.example.correct.impl.v1.test.adapters;

import com.prog.pattern.example.correct.impl.v1.test.pojo.Duck;
import com.prog.pattern.example.correct.impl.v1.test.pojo.Turkey;

public class TurkeyAdapter implements Duck {

    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    public void quack() {
        turkey.gobble();
    }
    public void fly() {
        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}