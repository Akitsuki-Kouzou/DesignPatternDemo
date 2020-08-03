package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/4 0:20
 **/
public class BackMuttonCommand extends Command {

    public BackMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.backMutton();
    }
}
