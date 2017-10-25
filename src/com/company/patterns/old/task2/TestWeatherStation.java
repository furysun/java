package com.company.patterns.old.task2;

public class TestWeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(5, 36, 4.8f);

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.notifyObserver();

        weatherData.setMeasurements(1, 3, 9.8f);
        weatherData.notifyObserver();

        weatherData.setMeasurements(2, 4, 5.8f);
        weatherData.notifyObserver();


    }
}
