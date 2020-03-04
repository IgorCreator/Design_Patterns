package com.prog.pattern.example.correct.impl.v3.weather.displays.api;

public interface Observer {
    void update(String temp, String pressure, String humidity, float heatIndex);
}
