package com.example.design.list;

import java.util.ArrayList;
import java.util.List;

/**
 * HandlerChain.
 *
 * @author zhangteng 2/16/21
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<IHandler>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if(handled) {
                break;
            }
        }
    }

}
