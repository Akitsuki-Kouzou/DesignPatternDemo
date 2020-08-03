package com.xay.test;

import com.xay.Camera;
import com.xay.Game;
import com.xay.Motorora;
import com.xay.Nokia;
import com.xay.Phone;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/3 23:44
 **/
public class BridgeTest {

    public static void main(String[] args) {
        Phone p1 = new Nokia();
        Phone p2 = new Motorora();

        p1.setSoftware(new Game());
        p1.run();

        p1.setSoftware(new Camera());
        p1.run();

        p2.setSoftware(new Game());
        p2.run();

        p2.setSoftware(new Camera());
        p2.run();
    }
}
