package com.xay.test;

import com.xay.Singleton;
import com.xay.SingletonDoubleCheckLock;
import com.xay.SingletonHolder;
import com.xay.SingletonHungry;
import com.xay.SingletonThreadSafe;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/29 1:19
 **/
public class SingletonTest {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton.getInstance();
            SingletonThreadSafe.getInstance();
            SingletonDoubleCheckLock.getInstance();
            SingletonHungry.getInstance();
            SingletonHolder.getInstance();
        }
    }
}
