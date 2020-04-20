package com.java.studyplan.designpatterns.decorate;

/**
 * @author xuguoqi
 * @desc 综合
 * @date 2020/4/18 16:57
 */
public class HouseBlend extends Beverage {

    public HouseBlend(String descripthion){
        super.descripthion = descripthion;
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
