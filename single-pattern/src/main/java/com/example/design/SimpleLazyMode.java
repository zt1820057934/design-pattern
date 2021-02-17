package com.example.design;

/**
 * SimpleLazyMode.
 * 2. 懒汉式 支持延时加载，但加锁不合理，串行
 * @author zhangteng 2/5/21
 */
public class SimpleLazyMode {

    private static SimpleLazyMode instance;

    private SimpleLazyMode() {}

    public static synchronized SimpleLazyMode getInstance() {
        if(instance == null) {
            return new SimpleLazyMode();
        }
        return instance;
    }

    public void operation() {}

}
