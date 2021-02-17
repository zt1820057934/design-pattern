package com.example.design.eventBusMock;

import java.util.concurrent.Executor;

/**
 * EventBus.
 * 单线程实现
 * @author zhangteng 2/16/21
 */
public class EventBus {

    private Executor executor;
    private ObserverRegistry observerRegistry = new ObserverRegistry();

    public EventBus() {
        // google提供的工具类，统一代码逻辑，实际上是单线程
        // this(MoreExecutors.directExecutor());
    }

    public EventBus(Executor executor) {
        this.executor = executor;
    }

    public void post(Object event) {
        // ....
    }

}
