package com.xay.test;

import com.xay.BackChickenWingCommand;
import com.xay.BackMuttonCommand;
import com.xay.Barbecuer;
import com.xay.Command;
import com.xay.Customer;
import com.xay.Waiter;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/4 0:46
 **/
public class CommandTest {

    public static void main(String[] args) {
        //初始化初始和服务员
        Barbecuer cooker = new Barbecuer();
        Waiter waiter = new Waiter(5,2);

        //来了顾客张三，准备点三串烤鸡翅
        Customer c1 = new Customer("张三");
        for (int i = 0; i < 3; i++) {
            waiter.setOrder(c1,new BackChickenWingCommand(cooker));
        }

        //张三又点了6串烤羊肉串
        Command readyToCancel = null;
        for (int i = 0; i < 6; i++) {
            if(0 == i) {
                readyToCancel = new BackMuttonCommand(cooker);
                waiter.setOrder(c1,readyToCancel);
                continue;
            }
            waiter.setOrder(c1, new BackMuttonCommand(cooker));
        }

        //张三捣乱，点了一个不存在的菜
        waiter.setOrder(c1, new Command(cooker) {
            @Override
            public void executeCommand() {
                System.out.println("爷来捣乱的！");
            }
        });
        //张三取消了一份烤羊肉串
        waiter.removeOrder(c1,readyToCancel);
        //张三取消了一份并不是他点的烤羊肉串
        waiter.removeOrder(c1,new BackMuttonCommand(cooker));

        //来了一个新的顾客李四
        Customer c2 = new Customer("李四");

        //李四点了一份鸡翅
        waiter.setOrder(c2, new BackChickenWingCommand(cooker));
        //李四点了一份烤羊肉串
        waiter.setOrder(c2, new BackMuttonCommand(cooker));

        waiter.notifyExecute();
    }
}
