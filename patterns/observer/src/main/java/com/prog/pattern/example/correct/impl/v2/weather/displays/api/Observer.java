package com.prog.pattern.example.correct.impl.v2.weather.displays.api;

public interface Observer {
    void update(String temp, String pressure, String humidity);
}
