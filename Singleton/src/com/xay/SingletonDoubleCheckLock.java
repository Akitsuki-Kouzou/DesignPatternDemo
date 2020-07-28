package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description 单例模式-饱汉式（线程安全&双重检查）
 * @date 2020/7/29 1:12
 **/
public class SingletonDoubleCheckLock {
    private volatile static SingletonDoubleCheckLock singleton = null;

    private SingletonDoubleCheckLock() {
        System.out.println("SingletonDoubleCheckLock构造方法被调用了");
    }

    public static SingletonDoubleCheckLock getInstance() {
        if(null == singleton) {
            synchronized (SingletonDoubleCheckLock.class) {
                if(null == singleton) {
                    singleton = new SingletonDoubleCheckLock();
                }
            }
        }
        return singleton;
    }
}
