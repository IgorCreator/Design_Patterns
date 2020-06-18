package com.prog.pattern.example.correct.impl.v1.simple_impl.pojo;

import com.prog.pattern.example.correct.impl.v1.simple_impl.Visitor;

public class Car {

    Engine engine;
    Body body;
    Wheel wheel;
    Bumper bumper;

    void accept(Visitor visitor){
        engine.accept(visitor);
        body.accept(visitor);
        wheel.accept(visitor);
        bumper.accept(visitor);

        visitor.visit(this);
    }

}
