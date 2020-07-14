package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/14 23:48
 **/
public abstract class Cook {

    private void makeRice(){
        System.out.println("蒸米饭");
    }

    private void serviceFood(){
        System.out.println("上菜");
    }

    public abstract void cookFood();

    public void startCook(){
        makeRice();
        cookFood();
        serviceFood();
    }
}
