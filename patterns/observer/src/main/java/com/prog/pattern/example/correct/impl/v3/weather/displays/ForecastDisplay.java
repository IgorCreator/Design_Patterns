package com.prog.pattern.example.correct.impl.v3.weather.displays;

import com.prog.pattern.example.correct.impl.v3.weather.data.Subject;
import com.prog.pattern.example.correct.impl.v3.weather.displays.api.DisplayElement;
import com.prog.pattern.example.correct.impl.v3.weather.displays.api.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private String temp;
    private String humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.resisterObserver(this);
    }

    public void update(String temp, String pressure, String humidity, float index) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println(
                "Forecast Display {" +
                        "temp='" + temp + '\'' +
                        ", humidity='" + humidity + '\'' +
                        '}');
    }
}