package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/13 23:35
 **/
public class Shoes extends Decorator {

    public Shoes(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("鞋子");
    }
}
