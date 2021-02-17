package com.example.design;

/**
 * UrgencyNotification.
 * 可自由组合phone、mail   紧急、普通 消息发送
 * @author zhangteng 2/7/21
 */
public class UrgencyNotification extends Notification {

    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    public void notify(String message) {
        msgSender.send(message);
    }

}
