package com.example.design.linked;

/**
 * Use.
 *
 * @author zhangteng 2/16/21
 */
public class Use {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerC());
        chain.addHandler(new HandlerB());
        chain.handle();
    }

}
