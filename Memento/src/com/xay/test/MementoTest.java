package com.xay.test;

import com.xay.Player;
import com.xay.StateCaretaker;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/27 1:07
 **/
public class MementoTest {

    public static void main(String[] args) {
        Player p = new Player();
        p.initState();
        p.showState();
        StateCaretaker stateManager = new StateCaretaker();
        stateManager.setMemento(p.saveState());

        System.out.println("************************");

        p.getAttack();
        p.showState();

        System.out.println("************************");

        p.loadState(stateManager.getMemento());
        p.showState();
    }
}
