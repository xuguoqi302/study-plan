package com.java.studyplan.designpatterns.decorate;

/**
 * @author xuguoqi
 * @desc TODO
 * @date 2020/4/18 16:58
 */
public class Mocha extends CondimentDecorate {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    /***
     * 描述
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription()+".摩卡";
    }
}
