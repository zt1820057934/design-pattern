package com.example.design.linked;

/**
 * HandlerChain.
 *
 * @author zhangteng 2/16/21
 */
public class HandlerChain {

    private Handler head = null;

    private Handler index = null;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);

        if(head == null) {
            head = handler;
            index = handler;
            return;
        }

        index.setSuccessor(handler);
        index = handler;
    }

    public void handle() {
        if(head != null) {
            head.handle();
        }
    }

}
