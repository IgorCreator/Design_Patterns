package com.prog.pattern.example.correct.impl.v1.simple_impl.pojo;

import com.prog.pattern.example.correct.impl.v1.simple_impl.Visitor;

public class Engine {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
