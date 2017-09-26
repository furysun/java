package com.company.patterns.task2;

public class TestWeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        WeatherData weatherData1 = new WeatherData();
        WeatherData weatherData2 = new WeatherData();

        weatherData.setMeasurements(5, 36, 4.8f);
        weatherData1.setMeasurements(7, 6, 7.8f);
        weatherData2.setMeasurements(1, 3, 9.8f);

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay1 = new CurrentConditionsDisplay(weatherData1);
        CurrentConditionsDisplay currentConditionsDisplay2 = new CurrentConditionsDisplay(weatherData2);
        weatherData.notifyObserver();
        currentConditionsDisplay.display();

        weatherData1.notifyObserver();
        currentConditionsDisplay1.display();

        weatherData2.notifyObserver();
        currentConditionsDisplay2.display();


    }
}
