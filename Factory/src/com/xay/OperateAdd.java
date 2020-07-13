package com.xay;

/**
 * @author ziling.wang@xay-china.com
 * @description
 * @date 2020/7/13 23:04
 **/
public class OperateAdd extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
