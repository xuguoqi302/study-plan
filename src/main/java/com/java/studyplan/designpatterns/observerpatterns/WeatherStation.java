package com.java.studyplan.designpatterns.observerpatterns;

/**
 * @author xuguoqi
 * @desc TODO
 * @date 2020/4/12 16:48
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeansurements(1, 2, 3);
    }
}
