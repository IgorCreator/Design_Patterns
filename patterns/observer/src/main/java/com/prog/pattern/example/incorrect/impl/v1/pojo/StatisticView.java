package com.prog.pattern.example.incorrect.impl.v1.pojo;

public class StatisticView {

    private String temp;
    private String pressure;
    private String humidity;

    public void update(String temp, String pressure, String humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }
}
