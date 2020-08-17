package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/18 0:49
 **/
public abstract class Manager {

    protected Manager superior;
    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    abstract public void dealRequest(Request request);

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }
}
