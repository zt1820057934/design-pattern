package com.example.design.linked;

/**
 * HandlerB.
 *
 * @author zhangteng 2/16/21
 */
public class HandlerB extends Handler {

    protected boolean doHandle() {
        boolean handled = false;
        System.out.println("BBBBB");
        return handled;
    }

}
