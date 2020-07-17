package com.xay.test;

import com.xay.Broker;
import com.xay.Message;
import com.xay.Publisher;
import com.xay.SubscriberA;
import com.xay.SubscriberB;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 17:29
 **/
public class PublisherAndSubscriberTest {

    public static void main(String[] args) {
        Broker b = new Broker();

        Publisher p = new Publisher(b);

        for (int i=0; i < 10000; i ++) {
            b.subscribeTopicA(new SubscriberA());
        }

        for (int i=0;i < 5000; i ++) {
            b.subscribeTopicB(new SubscriberB());
        }

        p.sendMessage(new Message("A","我是秋月孝三"));
        p.sendMessage(new Message("B","我是秋月爱莉"));
    }
}
