package com.xay.test;

import com.xay.Adapter;
import com.xay.Target;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/27 0:41
 **/
public class AdapterTest {

    public static void main(String[] args) {
        Target t = new Adapter();
        t.request();
    }
}
