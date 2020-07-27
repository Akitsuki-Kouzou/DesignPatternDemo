package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/27 23:25
 **/
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        System.out.println("Can't add");
    }

    @Override
    public void remove(Company c) {
        System.out.println("Can't remove");
    }

    @Override
    public void lineOfDuty() {
        System.out.println(getName() + " 公司财务收支管理");
    }
}
