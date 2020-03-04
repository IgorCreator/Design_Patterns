package com.prog.pattern.example.correct.impl.v4.weather.displays;

import com.prog.pattern.example.correct.impl.v4.weather.data.WeatherData;
import com.prog.pattern.example.correct.impl.v4.weather.displays.api.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private String temp;
    private String pressure;
    private String humidity;
    private Observable weatherData;

    public StatisticsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            this.humidity = weatherData.getHumidity();
            display();
        }
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
