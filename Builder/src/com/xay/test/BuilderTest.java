package com.xay.test;

import com.xay.FatPerson;
import com.xay.PersonDirector;
import com.xay.ThinPerson;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 0:07
 **/
public class BuilderTest {

    public static void main(String[] args) {
        PersonDirector pd1 =  new PersonDirector(new FatPerson());
        pd1.buildPerson();

        System.out.println("---------------------------------");

        PersonDirector pd2 = new PersonDirector(new ThinPerson());
        pd2.buildPerson();
    }
}
