package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/13 23:51
 **/
public class AddFactory implements IOperationFactory {
    @Override
    public Operation createOperation() {
        return new OperateAdd();
    }
}
