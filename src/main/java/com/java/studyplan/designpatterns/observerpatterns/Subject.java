package com.java.studyplan.designpatterns.observerpatterns;

/**
 * @author xuguoqi
 * @desc 主题接口
 * @date 2020/4/12 16:26
 */
public interface Subject {

    /**
     * 注册
     * @param observer
     */
    void regisgerObserver(Observer observer);

    /**
     * 删除
     * @param observer
     */
    void removeObServer(Observer observer);

    /**
     * 通知
     */
    void notifyObserver();


}
