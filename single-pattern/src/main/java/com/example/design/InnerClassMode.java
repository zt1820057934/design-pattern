package com.example.design;

/**
 * InnerClassMode.
 * 4. 内部类，比双重检测机制简单，由jvm保证锁安全性
 * @author zhangteng 2/5/21
 */
public class InnerClassMode {

    private InnerClassMode() {}

    private static class InnerHolder {
        private static final InnerClassMode instance = new InnerClassMode();
    }

    public static InnerClassMode getInstance() {
        return InnerHolder.instance;
    }

    public void operation() {}

}
