package com.xay.test;

import com.xay.Cook;
import com.xay.CookA;
import com.xay.CookB;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/14 23:51
 **/
public class TemplateTest {

    public static void main(String[] args) {
        Cook cookA = new CookA();
        Cook cookB = new CookB();

        cookA.startCook();
        System.out.println("---------------------");
        cookB.startCook();

    }
}
