package com.xay;

/**
 * @author ziling.wang@xay-china.com
 * @description
 * @date 2020/7/13 23:17
 **/
public class Context {

    private CashSuper cashSuper;

    public Context(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
