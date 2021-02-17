package com.example.design.linked;

/**
 * HandlerA.
 *
 * @author zhangteng 2/16/21
 */
public class HandlerA extends Handler {
    protected boolean doHandle() {
        boolean handled = false;
        System.out.println("AAAA");
        return handled;
    }
}
