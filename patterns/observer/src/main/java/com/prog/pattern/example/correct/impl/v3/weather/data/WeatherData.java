package com.prog.pattern.example.correct.impl.v3.weather.data;

import com.prog.pattern.example.correct.impl.v3.weather.displays.api.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private String temp;
    private String humidity;
    private String pressure;
    private float heatIndex;
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
        observers.forEach(o -> ((Observer) o).update(temp, humidity, pressure, heatIndex));
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(String temp, String humidity, String pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.heatIndex = computeHeatIndex(Float.parseFloat(temp), Float.parseFloat(pressure));
        measurementsChanged();
    }

    public String getTemperature() {
        return temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public float getHeatIndex() {
        return heatIndex;
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}
