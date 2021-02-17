package com.example.design.common;

/**
 * DemoObserver.
 *
 * @author zhangteng 2/16/21
 */
public class DemoObserver implements Observer {

    public void update(Message message) {
        System.out.println("订阅者收到消息: " + message.getMessage());
    }
}
