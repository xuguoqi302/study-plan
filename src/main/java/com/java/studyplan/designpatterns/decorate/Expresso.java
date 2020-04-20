package com.java.studyplan.designpatterns.decorate;

/**
 * @author xuguoqi
 * @desc TODO
 * @date 2020/4/18 16:54
 */
public class Expresso extends Beverage {

    public Expresso(String descripthion){
        super.descripthion = descripthion;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
