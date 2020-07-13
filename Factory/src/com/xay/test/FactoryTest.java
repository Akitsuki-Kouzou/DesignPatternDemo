package com.xay.test;

import com.xay.AddFactory;
import com.xay.IOperationFactory;
import com.xay.Operation;
import com.xay.SubFactory;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/13 23:52
 **/
public class FactoryTest {

    public static void main(String[] args) {
        IOperationFactory factory = new AddFactory();
        Operation op = factory.createOperation();
        op.setNumberA(1);
        op.setNumberB(2);
        System.out.println(op.getResult());
        System.out.println("-------------------------");
        factory = new SubFactory();
        op = factory.createOperation();
        op.setNumberA(2);
        op.setNumberB(1);
        System.out.println(op.getResult());
    }
}
