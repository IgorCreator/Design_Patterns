package com.prog.pattern.example.correct.impl.v1.test.simple;

public interface Subject {
    void resisterObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
