package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/13 23:32
 **/
public class Decorator extends Person {
    private Person person;

    public Decorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (null != person) {
            person.show();
        }
    }
}
