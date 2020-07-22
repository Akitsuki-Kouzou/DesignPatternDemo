package com.xay.test;

import com.xay.AbstractSqlFactory;
import com.xay.IUser;
import com.xay.MysqlFactory;

/**
 * @author ziling.wang@hand-china.com
 * @description 抽象工厂测试
 * @date 2020/7/23 1:25
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractSqlFactory factory = new MysqlFactory();

        IUser user = factory.creteUser();

        user.insertUser();
        user.selectUser();
    }
}
