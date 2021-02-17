package com.example.design;

/**
 * DoubleCheck.
 * 3. 双重检测，即可延时加载，又支持高并发
 * @author zhangteng 2/5/21
 */
public class DoubleCheckMode {

    private static DoubleCheckMode instance;

    private DoubleCheckMode() {}

    public static DoubleCheckMode getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckMode.class) {
                instance = new DoubleCheckMode();
            }
        }
        return instance;
    }

    public void operation() {}

}
