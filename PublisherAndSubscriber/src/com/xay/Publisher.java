package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 17:10
 **/
public class Publisher {

    private Broker broker;

    public Publisher(Broker broker) {
        this.broker = broker;
    }

    public void sendMessage(Message msg) {
        if(broker.publish(msg)) {
            System.out.println("成功发送消息！");
        }
    }
}
