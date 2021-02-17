package com.example.design.eventBusMock;

import java.util.concurrent.Executor;

/**
 * AsyncEventBus.
 * eventbus的异步多线程实现
 * @author zhangteng 2/16/21
 */
public class AsyncEventBus extends EventBus {

    public AsyncEventBus(Executor executor) {
        super(executor);
    }

}
