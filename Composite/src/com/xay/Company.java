package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/27 23:09
 **/
public abstract class Company {

    private String name;

    public Company (String name) {
        this.name = name;
    }

    public abstract void add(Company c);

    public abstract void remove(Company c);

    public void display(int depth) {
        for(int i = 0; i < depth; i ++) {
            System.out.print("-");
        }
        System.out.println(getName());
    }

    public abstract void lineOfDuty();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
