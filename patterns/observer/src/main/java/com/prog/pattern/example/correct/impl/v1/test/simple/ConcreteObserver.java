package com.prog.pattern.example.correct.impl.v1.test.simple;

public class ConcreteObserver implements Observer {

    Subject concreteSubject;

    public ConcreteObserver(Subject concreteSubject) {
        this.concreteSubject = concreteSubject;
        concreteSubject.resisterObserver(this);
    }

    public void update() {
        //Update local params;
    }
}
