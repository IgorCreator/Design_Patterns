package com.prog.pattern.example.correct.impl.v1.test.adapters;

import com.prog.pattern.example.correct.impl.v1.test.pojo.Duck;
import com.prog.pattern.example.correct.impl.v1.test.pojo.Turkey;

public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
