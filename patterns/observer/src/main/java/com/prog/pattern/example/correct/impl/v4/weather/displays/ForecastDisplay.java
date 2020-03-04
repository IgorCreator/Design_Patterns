package com.prog.pattern.example.correct.impl.v4.weather.displays;

import com.prog.pattern.example.correct.impl.v4.weather.data.WeatherData;
import com.prog.pattern.example.correct.impl.v4.weather.displays.api.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private String temp;
    private String humidity;
    private Observable weatherData;

    public ForecastDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemperature();
            this.humidity = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println(
                "Forecast Display {" +
                        "temp='" + temp + '\'' +
                        ", humidity='" + humidity + '\'' +
                        '}');
    }
}