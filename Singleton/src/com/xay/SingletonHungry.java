package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description 单例模式-饿汉模式
 * @date 2020/7/29 1:15
 **/
public class SingletonHungry {

    private static SingletonHungry singleton = new SingletonHungry();

    private SingletonHungry() {
        System.out.println("SingletonHungry构造方法被调用了");
    }

    public static SingletonHungry getInstance() {
        return singleton;
    }
}
