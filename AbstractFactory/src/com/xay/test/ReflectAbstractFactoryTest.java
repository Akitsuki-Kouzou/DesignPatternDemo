package com.xay.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.xay.AbstractSqlFactory;
import com.xay.IDepartment;
import com.xay.IUser;
import com.xay.SqlConsts;

/**
 * @author ziling.wang@hand-china.com
 * @description 结合了反射的抽象工厂测试
 * @date 2020/7/23 1:29
 **/
public class ReflectAbstractFactoryTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        AbstractSqlFactory factory = (AbstractSqlFactory) Class.forName(SqlConsts.FACTORY).newInstance();

        IUser user = factory.creteUser();
        user.insertUser();
        user.selectUser();

        IDepartment department = factory.createDepartment();
        department.insertDepartment();
        department.selectDepartment();
    }
}
