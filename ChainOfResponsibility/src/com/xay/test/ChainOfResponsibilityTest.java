package com.xay.test;

import com.xay.CommonManager;
import com.xay.GeneralManager;
import com.xay.Majordomo;
import com.xay.Manager;
import com.xay.Request;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/18 1:04
 **/
public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        Manager a = new CommonManager();
        Manager b = new Majordomo();
        Manager c = new GeneralManager();

        a.setSuperior(b);
        b.setSuperior(c);

        for (int i = 1; i <= 20 ; i++) {
            Request temp = new Request("请假", i);
            a.dealRequest(temp);
        }
    }
}
