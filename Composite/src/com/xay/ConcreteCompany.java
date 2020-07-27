package com.xay;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/27 23:14
 **/
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany (String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        for(int i = 0; i < depth; i ++) {
            System.out.print("-");
        }
        System.out.println(getName());

        for(Company c : children) {
            c.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for(Company c : children) {
            c.lineOfDuty();
        }
    }
}
