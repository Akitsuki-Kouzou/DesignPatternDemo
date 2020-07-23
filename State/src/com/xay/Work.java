package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 20:30
 **/
public class Work {

    private State state;
    private int hour;
    private boolean taskFinish;

    public Work() {
        //初始状态为早晨
        this.state = new MorningState();
    }

    public void writeProgram() {
        state.writeProgram(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isTaskFinish() {
        return taskFinish;
    }

    public void setTaskFinish(boolean taskFinish) {
        this.taskFinish = taskFinish;
    }
}
