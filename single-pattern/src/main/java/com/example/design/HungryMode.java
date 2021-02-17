package com.example.design;

/**
 * HungryMode.
 * 1. 饿汉式 实现简单/不支持延时加载
 * @author zhangteng 2/5/21
 */
public class HungryMode {

    private static final HungryMode instance = new HungryMode();

    private HungryMode() {}

    public static HungryMode getInstance() {
        return instance;
    }

    public void operation() {}

}
