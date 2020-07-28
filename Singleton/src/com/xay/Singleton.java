package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description 单例模式-饱汉式
 * @date 2020/7/28 22:47
 **/
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("Singleton构造方法被调用了");
    }

    public static Singleton getInstance() {
        if(null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
