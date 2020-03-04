package com.prog.pattern.example.incorrect.impl.v1;

import com.prog.pattern.example.incorrect.impl.v1.pojo.ForecastView;
import com.prog.pattern.example.incorrect.impl.v1.pojo.ScreenView;
import com.prog.pattern.example.incorrect.impl.v1.pojo.StatisticView;

public class WeatherData {

    ScreenView currentDisplay;
    StatisticView statisticDisplay;
    ForecastView forecastDisplay;


    public String getTemperature(){
        String temp = "76 F";
        return temp;
    }

    public String getHumidity(){
        String humidity = "90";
        return humidity;
    }

    private String getPressure(){
        String pressure = "780 ppm";
        return pressure;
    }

    public void measurementsChanged() {
        currentDisplay.update(getTemperature(), getPressure(), getHumidity());
        statisticDisplay.update(getTemperature(), getPressure(), getHumidity());
        forecastDisplay.update(getTemperature(), getPressure(), getHumidity());
    }

}
