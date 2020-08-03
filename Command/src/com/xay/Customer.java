package com.xay;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/4 0:33
 **/
public class Customer {

    private String name;

    private List<Command> commandList = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Command> getCommandList() {
        return commandList;
    }

    public void setCommandList(List<Command> commandList) {
        this.commandList = commandList;
    }
}
