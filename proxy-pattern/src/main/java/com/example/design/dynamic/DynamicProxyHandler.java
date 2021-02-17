package com.example.design.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * DynamicProxyHandler.
 *
 * @author zhangteng 2/7/21
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxiedObject;

    public DynamicProxyHandler(Object proxiedObject) {
        this.proxiedObject = proxiedObject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前置方法---------");
        Object result = method.invoke(proxiedObject, args);
        System.out.println("代理后置方法---------");
        return result;
    }
}
