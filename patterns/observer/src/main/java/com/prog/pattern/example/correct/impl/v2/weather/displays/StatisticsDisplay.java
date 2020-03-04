package com.prog.pattern.example.correct.impl.v2.weather.displays;

import com.prog.pattern.example.correct.impl.v2.weather.data.Subject;
import com.prog.pattern.example.correct.impl.v2.weather.displays.api.DisplayElement;
import com.prog.pattern.example.correct.impl.v2.weather.displays.api.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private String temp;
    private String pressure;
    private String humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.resisterObserver(this);
    }

    public void update(String temp, String pressure, String humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println(
                "Statistics Display {" +
                        "temp='" + temp + '\'' +
                        ", pressure='" + pressure + '\'' +
                        ", humidity='" + humidity + '\'' +
                        '}');
    }
}
