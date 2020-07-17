package com.xay;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 16:56
 **/
public class SubjectA implements Subject {

    private String name = "SubjectA";

    private List<Observer> obList = new ArrayList<>();

    @Override
    public void add(Observer o) {
        obList.add(o);
    }

    @Override
    public void remove(Observer o) {
        obList.remove(o);
    }

    @Override
    public void notify(String msg) {
        for (Observer ob : obList) {
            ob.update(name + "的消息：" + msg);
        }
    }
}
