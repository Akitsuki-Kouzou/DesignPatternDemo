package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 16:53
 **/
public class ObserverA implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("A观察者收到了消息，消息内容为：" + msg);
    }
}
