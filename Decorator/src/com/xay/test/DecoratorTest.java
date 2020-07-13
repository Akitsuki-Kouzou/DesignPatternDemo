package com.xay.test;

import com.xay.Cloth;
import com.xay.Person;
import com.xay.Shoes;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/13 23:36
 **/
public class DecoratorTest {

    public static void main(String[] args) {
        Person nuannuan = new Cloth(new Shoes(new Person()));
        nuannuan.show();
        System.out.println();
        nuannuan = new Shoes(new Cloth(new Person()));
        nuannuan.show();
        System.out.println();
        nuannuan = new Shoes(new Person());
        nuannuan.show();
        System.out.println();
        nuannuan = new Person();
        nuannuan.show();
    }
}
