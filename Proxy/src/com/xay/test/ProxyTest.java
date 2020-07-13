package com.xay.test;

import java.lang.reflect.Proxy;

import com.xay.BuyHouse;
import com.xay.DynamicBuyHouseProxyHandler;
import com.xay.HouseCompany;
import com.xay.Intermediary;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/13 23:42
 **/
public class ProxyTest {

    public static void main(String[] args) {
        BuyHouse buyHouse = new Intermediary(new HouseCompany());
        buyHouse.buyHouse();
        System.out.println("-------------------------------");
        BuyHouse dynamicBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
                new Class[] {BuyHouse.class}, new DynamicBuyHouseProxyHandler(new HouseCompany()));
        dynamicBuyHouse.buyHouse();
    }
}
