package com.example.design;

/**
 * Notification.
 *
 * @author zhangteng 2/7/21
 */
public abstract class Notification {

    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);

}
