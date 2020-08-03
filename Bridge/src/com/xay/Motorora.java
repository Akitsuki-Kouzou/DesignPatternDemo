package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/3 23:43
 **/
public class Motorora extends Phone {
    @Override
    public void run() {
        System.out.println("摩托罗拉手机开始运行软件");
        getSoftware().run();
    }
}
