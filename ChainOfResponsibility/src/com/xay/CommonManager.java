package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/18 0:52
 **/
public class CommonManager extends Manager {

    public CommonManager() {
        super("经理");
    }

    @Override
    public void dealRequest(Request request) {
        if("请假".equals(request.getRequestType()) && 2 >= request.getNumber()) {
            System.out.println(name + "批准请假" + request.getNumber() + "天");
        } else {
            if (null != superior) {
                superior.dealRequest(request);
            }
        }
    }
}
