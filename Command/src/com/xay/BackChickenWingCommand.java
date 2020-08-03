package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/4 0:21
 **/
public class BackChickenWingCommand extends Command {

    public BackChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.backChichenWing();
    }
}
