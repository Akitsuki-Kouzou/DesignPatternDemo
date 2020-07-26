package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/27 0:41
 **/
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
