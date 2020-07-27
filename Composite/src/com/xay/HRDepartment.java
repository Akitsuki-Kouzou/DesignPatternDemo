package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/27 23:20
 **/
public class HRDepartment extends Company {

    public HRDepartment(String name) {
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
        System.out.println(getName() + " 员工招聘，培训管理");
    }
}
