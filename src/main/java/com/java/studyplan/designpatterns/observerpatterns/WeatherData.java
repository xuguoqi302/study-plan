package com.java.studyplan.designpatterns.observerpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuguoqi
 * @desc TODO
 * @date 2020/4/12 16:33
 */
public class WeatherData implements Subject {

    private List<Observer> observerList;

    private float temperrature;

    private float humidity;

    private float pressure;

    public WeatherData(){
        this.observerList = new ArrayList<>();
    }


    /**
     * 注册
     *
     * @param observer
     */
    @Override
    public void regisgerObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除
     *
     * @param observer
     */
    @Override
    public void removeObServer(Observer observer) {
        observerList.remove(observer);

    }

    /**
     * 通知
     */
    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(temperrature,humidity,pressure);
        }
    }

    public void meansurementsChanged(){
        notifyObserver();
    }

    public void setMeansurements(float temperrature,float humidity,float pressure){
        this.temperrature = temperrature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.meansurementsChanged();
    }
}
