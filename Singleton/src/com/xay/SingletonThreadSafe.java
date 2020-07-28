package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description 单例模式-饱汉式（线程安全）
 * @date 2020/7/28 22:49
 **/
public class SingletonThreadSafe {

    private static SingletonThreadSafe singleton = null;

    private SingletonThreadSafe() {
        System.out.println("SingletonThreadSafe构造方法被调用了");
    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (null == singleton) {
            singleton = new SingletonThreadSafe();
        }
        return singleton;
    }
}
