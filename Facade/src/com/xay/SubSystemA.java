package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/15 23:29
 **/
public class SubSystemA {

    public void functionA() {
        System.out.println(this.getClass().getName() + " functionA");
    }

    public void functionB() {
        System.out.println(this.getClass().getName() + " functionB");
    }

    public void functionC() {
        System.out.println(this.getClass().getName() + " functionC");
    }
}
