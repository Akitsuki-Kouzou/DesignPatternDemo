package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 1:18
 **/
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insertDepartment() {
        System.out.println("sqlserver插入了一条部门数据");
    }

    @Override
    public void selectDepartment() {
        System.out.println("sqlserver查询了部门数据");
    }
}
