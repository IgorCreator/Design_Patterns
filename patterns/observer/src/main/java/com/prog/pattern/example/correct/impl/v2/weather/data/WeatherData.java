package com.prog.pattern.example.correct.impl.v2.weather.data;

import com.prog.pattern.example.correct.impl.v2.weather.displays.api.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private String temp;
    private String humidity;
    private String pressure;
    private List observers = new ArrayList();

    public void resisterObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObserver() {
        observers.forEach(o -> ((Observer) o).update(temp, humidity, pressure));
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(String temp, String humidity, String pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public String getTemperature() {
        return temp;
    }

    public String getHumidity() {
        return humidity;
    }

    private String getPressure() {
        return pressure;
    }
}
