package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/8/18 0:51
 **/
public class Request {

    private String requestType;

    private int number;

    public Request(String requestType, int number) {
        this.requestType = requestType;
        this.number = number;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
