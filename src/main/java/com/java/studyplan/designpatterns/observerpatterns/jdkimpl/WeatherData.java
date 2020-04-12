package com.java.studyplan.designpatterns.observerpatterns.jdkimpl;

import java.util.Observable;

/**
 * @author xuguoqi
 * @desc TODO
 * @date 2020/4/12 16:33
 */
public class WeatherData extends Observable {


    private float temperrature;

    private float humidity;

    private float pressure;


    public void meansurementsChanged(){
        super.setChanged();
        super.notifyObservers();
    }

    public void setMeansurements(float temperrature,float humidity,float pressure){
        this.temperrature = temperrature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.meansurementsChanged();
    }

    public float getTemperrature() {
        return temperrature;
    }

    public void setTemperrature(float temperrature) {
        this.temperrature = temperrature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
