package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 17:10
 **/
public class Message {

    private String topic;

    private String content;

    public Message(String topic, String content) {
        this.topic = topic;
        this.content = content;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
