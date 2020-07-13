package com.xay.test;

import com.xay.Operation;
import com.xay.OperationFactory;

/**
 * @author ziling.wang@xay-china.com
 * @description
 * @date 2020/7/13 23:10
 **/
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Operation a = OperationFactory.createOperate("+");
        a.setNumberA(1);
        a.setNumberB(1);
        Operation b = OperationFactory.createOperate("-");
        b.setNumberA(2);
        b.setNumberB(1);

        System.out.println(a.getResult());
        System.out.println(b.getResult());
    }
}
