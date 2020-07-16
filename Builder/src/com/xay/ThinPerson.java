package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 0:04
 **/
public class ThinPerson extends Person {
    @Override
    public void drawHead() {
        System.out.println("画一个小瘦脸");
    }

    @Override
    public void drawBody() {
        System.out.println("画一个小肚子");
    }

    @Override
    public void drawLeftHand() {
        System.out.println("画左手");
    }

    @Override
    public void drawRightHand() {
        System.out.println("画右手");
    }

    @Override
    public void drawLeftLeg() {
        System.out.println("画细左腿");
    }

    @Override
    public void drawRightLeg() {
        System.out.println("画细右腿");
    }
}
