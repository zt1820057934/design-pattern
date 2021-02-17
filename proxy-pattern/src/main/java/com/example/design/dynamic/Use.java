package com.example.design.dynamic;

import java.lang.reflect.Proxy;

import com.example.design.IPrint;
import com.example.design.Print;

/**
 * Use.
 *
 * @author zhangteng 2/7/21
 */
public class Use {

    public static void main(String[] args) {
        Print print = new Print();
        DynamicProxyHandler handler = new DynamicProxyHandler(print);
        Object o = Proxy.newProxyInstance(print.getClass().getClassLoader(), print.getClass().getInterfaces(), handler);
        ((IPrint) o).print();
    }

}
