package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/15 23:32
 **/
public class Facade {

    private SubSystemA subSystemA;
    private SubSystemB subSystemB;

    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
    }


    public void easyFunction() {
        //模拟对子系统的复杂调用
        subSystemA.functionA();
        subSystemA.functionC();
        subSystemB.functionD();
        subSystemB.functionE();
        subSystemA.functionB();
        subSystemB.functionF();
    }
}
