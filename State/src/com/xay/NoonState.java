package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 20:35
 **/
public class NoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if(13 > w.getHour()) {
            System.out.println(w.getHour() + "点，中午工作，犯困");
        } else {
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
