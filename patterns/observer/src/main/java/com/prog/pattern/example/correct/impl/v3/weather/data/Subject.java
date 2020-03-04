package com.prog.pattern.example.correct.impl.v3.weather.data;

import com.prog.pattern.example.correct.impl.v3.weather.displays.api.Observer;

public interface Subject {
    void resisterObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
