package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 20:38
 **/
public class RestState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println(w.getHour() + "点，下班了，不工作了！");
    }
}
