package com.xay.test;

import com.xay.CashNormal;
import com.xay.CashRebeat;
import com.xay.CashReturn;
import com.xay.CashSuper;
import com.xay.Context;
import com.xay.ContextBySimpleFactory;

/**
 * @author ziling.wang@xay-china.com
 * @description
 * @date 2020/7/13 23:18
 **/
public class StrategyTest {

    public static void main(String[] args) {
        String typeA = "打八折";
        String typeB = "满三百减一百";
        String typeC = "原价";
        CashSuper c1 = new CashRebeat(0.8);
        CashSuper c2 = new CashReturn(300,100);
        CashSuper c3 = new CashNormal();

        double money = 1000;
        Context context = new Context(c1);
        System.out.println(context.getResult(money));
        context = new Context(c2);
        System.out.println(context.getResult(money));
        context = new Context(c3);
        System.out.println(context.getResult(money));

        System.out.println("-----------------------------");

        ContextBySimpleFactory contextBySimpleFactory = new ContextBySimpleFactory(typeA);
        System.out.println(contextBySimpleFactory.getResult(money));
        contextBySimpleFactory = new ContextBySimpleFactory(typeB);
        System.out.println(contextBySimpleFactory.getResult(money));
        contextBySimpleFactory = new ContextBySimpleFactory(typeC);
        System.out.println(contextBySimpleFactory.getResult(money));
    }
}
