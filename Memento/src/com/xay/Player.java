package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/27 1:01
 **/
public class Player {

    private int hp;
    private int mp;
    private int exp;

    public StateMemento saveState() {
        return new StateMemento(hp,mp,exp);
    }

    public void loadState(StateMemento memento) {
        this.hp = memento.getHp();
        this.mp = memento.getMp();
        this.exp = memento.getExp();
    }

    public void getAttack() {
        hp = hp - 30;
        exp = exp + 20;
    }

    public void initState() {
        this.hp = 100;
        this.mp = 100;
        this.exp = 300;
    }

    public void showState() {
        System.out.println("HP:" + hp);
        System.out.println("MP:" + mp);
        System.out.println("EXP:" + exp);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
