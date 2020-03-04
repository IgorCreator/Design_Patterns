package com.prog.pattern.example.incorrect.impl.v1.pojo;

public class ScreenView {

    private String temp;
    private String pressure;
    private String humidity;

    public ScreenView() {
        this.temp = "70 F";
        this.pressure = "776 ppm";
        this.humidity = "60";
    }

    public void update(String temp, String pressure, String humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }
}
