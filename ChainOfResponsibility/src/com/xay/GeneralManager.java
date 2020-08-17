package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/18 0:59
 **/
public class GeneralManager extends Manager {

    public GeneralManager() {
        super("总经理");
    }

    @Override
    public void dealRequest(Request request) {
        if("请假".equals(request.getRequestType())) {
            if(10 >= request.getNumber()) {
                System.out.println(name + "批准请假" + request.getNumber() + "天");
            } else {
                System.out.println(name + "：滚");
            }
        } else {
            System.out.println(name + "：滚");
        }
    }
}
