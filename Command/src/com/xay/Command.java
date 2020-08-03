package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/4 0:17
 **/
public abstract class Command {

    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    public abstract void executeCommand();
}
