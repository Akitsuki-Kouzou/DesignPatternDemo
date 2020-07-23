package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 20:37
 **/
public class SleepingState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println(w.getHour() + "点，顶不住睡着了！");
    }
}
