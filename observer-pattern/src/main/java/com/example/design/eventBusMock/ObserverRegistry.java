package com.example.design.eventBusMock;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * ObserverRegistry.
 * 注册表 - 最复杂的地方
 * @author zhangteng 2/16/21
 */
public class ObserverRegistry {

    /**
     * CopyOnWriteArraySet
     * 在写入的时候，会创建一个新的set，并且将原来数据克隆到新set中，数据写入完成后，新set替换老的set，
     * 这样能保证写入时，不影响数据的读取操作，以此解决读写并发问题
     * 另外CopyOnWriteSet 还通过加锁的方式，避免了并发写冲突
     */
    private ConcurrentHashMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new ConcurrentHashMap<Class<?>, CopyOnWriteArraySet<ObserverAction>>();

    public void registry(Object observer) {

    }


    private Map<Class<?>, CopyOnWriteArraySet<ObserverAction>> findAllObserverActions() {
        // ...
        return null;
    }



}
