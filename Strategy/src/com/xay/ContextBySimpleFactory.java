package com.xay;

/**
 * @author ziling.wang@xay-china.com
 * @description
 * @date 2020/7/13 23:19
 **/
public class ContextBySimpleFactory {
    private CashSuper cashSuper;

    public ContextBySimpleFactory(String type) {
        switch (type) {
            case "原价":
                this.cashSuper = new CashNormal();
                break;
            case "打八折":
                this.cashSuper = new CashRebeat(0.8);
                break;
            case "满三百减一百":
                this.cashSuper = new CashReturn(300,100);
                break;
            default:
                throw new RuntimeException("无对应策略！");
        }
    }

    public double getResult(double money) {
        return this.cashSuper.acceptCash(money);
    }
}
