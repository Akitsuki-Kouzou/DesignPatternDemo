package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/18 0:57
 **/
public class Majordomo extends Manager {

    public Majordomo() {
        super("总监");
    }

    @Override
    public void dealRequest(Request request) {
        if("请假".equals(request.getRequestType()) && 5 >= request.getNumber() ) {
            System.out.println(name + "批准请假" + request.getNumber() + "天");
        } else {
            if (null != superior) {
                superior.dealRequest(request);
            }
        }
    }
}
