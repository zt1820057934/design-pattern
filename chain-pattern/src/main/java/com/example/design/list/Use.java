package com.example.design.list;

/**
 * Use.
 *
 * @author zhangteng 2/16/21
 */
public class Use {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.addHandler(new HandlerC());
        chain.handle();
    }

}
