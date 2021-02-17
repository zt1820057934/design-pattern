package com.example.design.staticc;

import com.example.design.Print;

/**
 * PrintProxy.
 * 继承被代理类的方式
 * @author zhangteng 2/7/21
 */
public class PrintProxyOne extends Print {
    @Override
    public void print() {
        System.out.println("代理前置方法---------");
        super.print();
        System.out.println("代理后置方法---------");
    }

    public static void main(String[] args) {
        Print print = new PrintProxyOne();
        print.print();
    }

}
