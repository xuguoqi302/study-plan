package com.java.studyplan.designpatterns.observerpatterns;

/**
 * @author xuguoqi
 * @desc TODO
 * @date 2020/4/12 16:40
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temperrature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;


    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.regisgerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前情况展示：温度：" + temperrature + ",湿度：" + humidity + ",气压：" + pressure);
    }

    /**
     * 主题更新时会被调用
     *
     * @param temperrature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temperrature, float humidity, float pressure) {
        this.temperrature = temperrature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
