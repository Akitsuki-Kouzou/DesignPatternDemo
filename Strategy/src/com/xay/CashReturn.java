package com.xay;

/**
 * @author ziling.wang@xay-china.com
 * @description
 * @date 2020/7/13 23:15
 **/
public class CashReturn extends CashSuper {

    private double condition = 0;
    private double moneyReturn = 0;

    public CashReturn(double condition, double moneyReturn) {
        this.condition = condition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        return money - Math.floor(money / condition) * moneyReturn;
    }
}
