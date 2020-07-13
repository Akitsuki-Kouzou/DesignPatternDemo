package com.xay;

/**
 * @author ziling.wang@xay-china.com
 * @description
 * @date 2020/7/13 23:14
 **/
public class CashRebeat extends CashSuper {

    private double rebate = 1;

    public CashRebeat (double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }
}
