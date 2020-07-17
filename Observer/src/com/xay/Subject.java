package com.xay;

import java.util.List;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 16:55
 **/
public interface Subject {

    void add(Observer o);
    void remove(Observer o);
    void notify(String msg);
}
