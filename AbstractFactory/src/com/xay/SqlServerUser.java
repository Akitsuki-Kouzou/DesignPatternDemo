package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 1:14
 **/
public class SqlServerUser implements IUser {
    @Override
    public void insertUser() {
        System.out.println("sqlserver插入了一条用户数据");
    }

    @Override
    public void selectUser() {
        System.out.println("sqlserver查询了用户数据");
    }
}
