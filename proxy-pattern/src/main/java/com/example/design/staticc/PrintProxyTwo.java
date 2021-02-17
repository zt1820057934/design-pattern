package com.example.design.staticc;

import com.example.design.IPrint;
import com.example.design.Print;

/**
 * PrintProxyTwo.
 * 实现相同接口的方式
 * @author zhangteng 2/7/21
 */
public class PrintProxyTwo implements IPrint {

    private Print print;

    public PrintProxyTwo(Print print) {
        this.print = print;
    }

    public void print() {
        System.out.println("代理前置方法---------");
        print.print();
        System.out.println("代理后置方法---------");
    }

    public static void main(String[] args) {
        IPrint print = new PrintProxyTwo(new Print());
        print.print();
    }

}
