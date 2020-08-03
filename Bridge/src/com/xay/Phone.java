package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/3 23:39
 **/
public abstract class Phone {

    private Software software;

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public abstract void run();
}
