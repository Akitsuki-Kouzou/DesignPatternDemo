package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 1:16
 **/
public class MysqlUser implements IUser {
    @Override
    public void insertUser() {
        System.out.println("mysql插入了一条用户数据");
    }

    @Override
    public void selectUser() {
        System.out.println("mysql查询了用户数据");
    }
}
