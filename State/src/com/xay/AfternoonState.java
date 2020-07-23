package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 20:35
 **/
public class AfternoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if(17 > w.getHour()) {
            System.out.println(w.getHour() + "点，下午工作，感觉海星~");
        } else {
            w.setState(new NightState());
            w.writeProgram();
        }
    }
}
