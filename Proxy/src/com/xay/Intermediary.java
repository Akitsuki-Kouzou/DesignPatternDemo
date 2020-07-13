package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/13 23:40
 **/
public class Intermediary implements BuyHouse {

    private BuyHouse buyHouse;

    public Intermediary(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("赚黑心钱");
        System.out.println("售前处理");
        buyHouse.buyHouse();
        System.out.println("售后处理");
    }
}
