package com.java.studyplan.designpatterns.observerpatterns;

/**
 * @author xuguoqi
 * @desc 观察者接口
 * @date 2020/4/12 16:28
 */
public interface Observer {

    /**
     * 主题更新时会被调用
     * @param temperrature
     * @param humidity
     * @param pressure
     */
    void update(float temperrature, float humidity, float pressure);

}
