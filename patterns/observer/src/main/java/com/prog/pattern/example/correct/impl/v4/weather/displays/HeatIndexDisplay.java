package com.prog.pattern.example.correct.impl.v4.weather.displays;

import com.prog.pattern.example.correct.impl.v4.weather.data.WeatherData;
import com.prog.pattern.example.correct.impl.v4.weather.displays.api.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {

    private float index;
    private Observable weatherData;

    public HeatIndexDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.index = weatherData.getHeatIndex();
            display();
        }
    }

    public void display() {
        System.out.println(
                "Heat Index Display {" +
                        "index='" + index + '\'' +
                        '}');
    }
}
