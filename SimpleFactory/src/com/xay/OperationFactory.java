package com.xay;

/**
 * @author ziling.wang@xay-china.com
 * @description
 * @date 2020/7/13 23:05
 **/
public class OperationFactory {

    private OperationFactory() {}

    public static Operation createOperate(String operate) {
        Operation operation = null;

        switch (operate) {
            case "+":
                operation =  new OperateAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            default:
                throw new RuntimeException("不支持的运算！");
        }
        return operation;
    }
}
