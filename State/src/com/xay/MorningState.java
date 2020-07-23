package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 20:33
 **/
public class MorningState extends State {

    @Override
    public void writeProgram(Work w) {
        if(12 > w.getHour()) {
            System.out.println(w.getHour() + "点，早上工作，有精神");
        } else {
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
