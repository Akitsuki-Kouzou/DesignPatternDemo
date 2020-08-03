package com.xay;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/4 0:22
 **/
public class Waiter {

    private Set<Customer> customers = new HashSet<>();
    /**
     * 羊肉剩余
     */
    private int muttonRest;
    /**
     * 鸡翅剩余
     */
    private int chickenWingRest;

    public Waiter(int muttonRest,int chickenWingRest) {
        this.muttonRest = muttonRest;
        this.chickenWingRest = chickenWingRest;
    }

    public void setOrder(Customer customer, Command command) {
        if(command instanceof BackMuttonCommand) {
            if(0 < muttonRest) {
                muttonRest --;
                customer.getCommandList().add(command);
                System.out.println(customer.getName() + "增加订单：烤羊肉*1，时间：" + new Date());
                customers.add(customer);
            } else {
                System.out.println(customer.getName() + "，没有羊肉了，请点别的烧烤");
            }

        } else if (command instanceof BackChickenWingCommand) {
            if(0 < chickenWingRest) {
                chickenWingRest --;
                customer.getCommandList().add(command);
                System.out.println(customer.getName() + "增加订单：烤鸡翅*1，时间：" + new Date());
                customers.add(customer);
            } else {
                System.out.println(customer.getName() + "，没有鸡翅了，请点别的烧烤");
            }
        } else {
            System.out.println(customer.getName() + "，店里没有这种烧烤，请别开玩笑~");
        }
    }

    public void removeOrder(Customer customer ,Command command) {
        if(customer.getCommandList().contains(command)) {
            if(command instanceof BackMuttonCommand) {
                System.out.println(customer.getName() + "取消订单：烤羊肉*1，时间：" + new Date());
                customer.getCommandList().remove(command);
                muttonRest ++;
            } else if(command instanceof BackChickenWingCommand){
                System.out.println(customer.getName() + "取消订单：烤鸡翅*1，时间：" + new Date());
                customer.getCommandList().remove(command);
                chickenWingRest ++;
            }
        } else {
            System.out.println(customer.getName() + "没有点这个！");
        }
    }

    public void notifyExecute() {
        for (Customer customer : customers) {
            for (Command command : customer.getCommandList()) {
                command.executeCommand();
            }
        }
    }
}
