package com.xay;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 17:11
 **/
public class Broker {

    private List<Subscriber> topicAObList = new ArrayList<>();
    private List<Subscriber> topicBObList = new ArrayList<>();

    public void subscribeTopicA(Subscriber ob) {
        topicAObList.add(ob);
    }

    public void subscribeTopicB(Subscriber ob) {
        topicBObList.add(ob);
    }

    public boolean publish(Message m) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                switch (m.getTopic()) {
                    case "A":
                        for(Subscriber s : topicAObList) {
                            s.receiveMsg(m);
                        }
                        break;
                    case "B":
                        for(Subscriber s : topicBObList) {
                            s.receiveMsg(m);
                        }
                        break;
                    default:
                        break;
                }
            }
        };
        try {
            Thread t = new Thread(r);
            t.start();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
