package com.xay;

/**
 * @author ziling.wang@xay-china.com
 * @description
 * @date 2020/7/13 23:05
 **/
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
