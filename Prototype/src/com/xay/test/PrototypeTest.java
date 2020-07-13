package com.xay.test;

import java.util.Arrays;

import com.xay.Person;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/14 0:02
 **/
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        String[] hobbies = {"篮球","编程","足球"};
        Person p = new Person("秋月孝三",30, Arrays.asList(hobbies));

        for(int i = 0; i < 10; i ++) {
            System.out.println(p.clone());
        }
    }
}
