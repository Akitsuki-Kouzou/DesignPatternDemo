package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/27 1:06
 **/
public class StateCaretaker {

    private StateMemento memento;

    public StateMemento getMemento() {
        return memento;
    }

    public void setMemento(StateMemento memento) {
        this.memento = memento;
    }
}
