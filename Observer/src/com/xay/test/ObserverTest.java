package com.xay.test;

import com.xay.Observer;
import com.xay.ObserverA;
import com.xay.ObserverB;
import com.xay.Subject;
import com.xay.SubjectA;
import com.xay.SubjectB;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 17:01
 **/
public class ObserverTest {

    public static void main(String[] args) {
        Subject s1 = new SubjectA();
        Subject s2 = new SubjectB();

        Observer o1 = new ObserverA();
        Observer o2 = new ObserverB();

        s1.add(o1);
        s1.add(o2);
        s2.add(o2);

        s1.notify("我是秋月孝三");

        System.out.println("------------------------------------");

        s2.notify("我是秋月爱莉");
    }
}
