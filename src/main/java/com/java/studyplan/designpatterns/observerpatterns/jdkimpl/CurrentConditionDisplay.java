package com.java.studyplan.designpatterns.observerpatterns.jdkimpl;

import com.java.studyplan.designpatterns.observerpatterns.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xuguoqi
 * @desc TODO
 * @date 2020/4/12 16:40
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temperrature;
    private float humidity;
    private float pressure;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前情况展示：温度：" + temperrature + ",湿度：" + humidity + ",气压：" + pressure);
    }



    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
       if(o instanceof WeatherData){
           WeatherData weatherData = (WeatherData) o;
           this.temperrature = weatherData.getTemperrature();
           this.humidity = weatherData.getHumidity();
           this.pressure = weatherData.getPressure();
           this.display();
       }
    }
}
