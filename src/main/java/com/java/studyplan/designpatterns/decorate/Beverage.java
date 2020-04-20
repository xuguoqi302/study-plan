package com.java.studyplan.designpatterns.decorate;

/**
 * @author xuguoqi
 * @desc 饮料
 * @date 2020/4/18 16:46
 */
public abstract class Beverage {

    protected String descripthion = "unknow beverage";

    public String getDescription(){
        return descripthion;
    }

    public abstract double cost();

}
