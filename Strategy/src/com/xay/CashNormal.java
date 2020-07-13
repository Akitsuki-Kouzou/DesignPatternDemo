package com.xay;

/**
 * @author ziling.wang@xay-china.com
 * @description
 * @date 2020/7/13 23:14
 **/
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
