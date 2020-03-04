package com.prog.pattern.example.correct.impl.v2.weather;

import com.prog.pattern.example.correct.impl.v2.weather.data.WeatherData;
import com.prog.pattern.example.correct.impl.v2.weather.displays.CurrentConditionDisplay;
import com.prog.pattern.example.correct.impl.v2.weather.displays.ForecastDisplay;
import com.prog.pattern.example.correct.impl.v2.weather.displays.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay =
                new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements("80", "65", "30.4");
        weatherData.setMeasurements("82", "70", "29.2");
        weatherData.setMeasurements("78", "90", "29.2");
    }

}
