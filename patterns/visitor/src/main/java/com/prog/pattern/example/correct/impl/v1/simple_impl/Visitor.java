package com.prog.pattern.example.correct.impl.v1.simple_impl;

import com.prog.pattern.example.correct.impl.v1.simple_impl.pojo.*;

public interface Visitor {
    void visit(Car car);
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Bumper bumper);
}
