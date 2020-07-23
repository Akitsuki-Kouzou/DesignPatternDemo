package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 20:36
 **/
public class NightState extends State {
    @Override
    public void writeProgram(Work w) {
        if(w.isTaskFinish()) {
            w.setState(new RestState());
            w.writeProgram();
        } else {
            if(21 > w.getHour()) {
                System.out.println(w.getHour() + "点，晚上工作，犯困");
            } else {
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
