package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 17:17
 **/
public class SubscriberA implements Subscriber {

    @Override
    public void receiveMsg(Message m) {
        System.out.println("A订阅者收到了来自" + m.getTopic() + "主题的消息，内容为：" + m.getContent());
    }
}
