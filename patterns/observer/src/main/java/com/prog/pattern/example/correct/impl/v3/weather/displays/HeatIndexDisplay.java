package com.prog.pattern.example.correct.impl.v3.weather.displays;

import com.prog.pattern.example.correct.impl.v3.weather.data.Subject;
import com.prog.pattern.example.correct.impl.v3.weather.displays.api.DisplayElement;
import com.prog.pattern.example.correct.impl.v3.weather.displays.api.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {

    private float index;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.resisterObserver(this);
    }

    public void update(String temp, String pressure, String humidity, float index) {
        this.index = index;
        display();
    }

    public void display() {
        System.out.println(
                "Heat Index Display {" +
                        "index='" + index + '\'' +
                        '}');
    }
}
