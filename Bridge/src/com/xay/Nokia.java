package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/3 23:41
 **/
public class Nokia extends Phone {
    @Override
    public void run() {
        System.out.println("诺基亚手机开始运行软件");
        getSoftware().run();
    }
}
