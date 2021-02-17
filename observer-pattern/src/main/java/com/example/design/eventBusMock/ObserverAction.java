package com.example.design.eventBusMock;

import java.lang.reflect.Method;

/**
 * ObserverAction.
 * observer值, 定位哪个对象的哪个方法
 * @author zhangteng 2/16/21
 */
public class ObserverAction {

    private Object target;

    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
    }

    public void execute(Object event) {
        try {
            method.invoke(target, event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
