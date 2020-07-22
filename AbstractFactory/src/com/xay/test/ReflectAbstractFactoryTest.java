package com.xay.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
        Class<?> user =  Class.forName(SqlConsts.USER_OP);
        IUser uInstance = (IUser) user.newInstance();
        uInstance.insertUser();
        uInstance.selectUser();

        Class<?> department = Class.forName(SqlConsts.DEPARTMENT_OP);
        IDepartment dInstance = (IDepartment) department.newInstance();
        dInstance.insertDepartment();
        dInstance.selectDepartment();
    }
}
