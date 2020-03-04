package com.prog.pattern.example.correct.impl.v1.test.simple;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    List observers = new ArrayList();

    public void resisterObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        setState();
    }

    public void getState(){
        //        return
    }

    public void setState(){
        //update params
    }
}
