package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 1:17
 **/
public class MysqlDepartment implements IDepartment {
    @Override
    public void insertDepartment() {
        System.out.println("mysql插入了一条部门数据");
    }

    @Override
    public void selectDepartment() {
        System.out.println("mysql查询了部门数据");
    }
}
