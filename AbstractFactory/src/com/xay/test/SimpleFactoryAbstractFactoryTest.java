package com.xay.test;

import com.xay.DataAccess;
import com.xay.IUser;

/**
 * @author ziling.wang@hand-china.com
 * @description  结合了简单工厂
 * @date 2020/7/23 1:27
 **/
public class SimpleFactoryAbstractFactoryTest {

    public static void main(String[] args) {
        IUser user = DataAccess.createUser();

        user.selectUser();
        user.insertUser();
    }
}
