package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description 单例模式-Holder模式
 * @date 2020/7/29 1:17
 **/
public class SingletonHolder {

    private static class Holder {
        private static SingletonHolder singleton = new SingletonHolder();
    }

    private SingletonHolder() {
        System.out.println("SingletonHolder构造方法被调用了");
    }

    public static SingletonHolder getInstance() {
        return Holder.singleton;
    }
}
