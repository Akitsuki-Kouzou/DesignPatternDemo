package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/13 23:34
 **/
public class Cloth extends Decorator {

    public Cloth(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("外套");
    }
}
