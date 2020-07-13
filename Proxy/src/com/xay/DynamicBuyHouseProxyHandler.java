package com.xay;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/13 23:44
 **/
public class DynamicBuyHouseProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicBuyHouseProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("赚黑心钱");
        System.out.println("售前处理");
        Object result = method.invoke(object,args);
        System.out.println("售后处理");
        return result;
    }
}
