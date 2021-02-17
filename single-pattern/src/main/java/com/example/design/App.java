package com.example.design;

/**
 * APP.
 *
 * @author zhangteng 2/5/21
 */
public class App {

    public static void main(String[] args) {
        SimpleLazyMode.getInstance().operation();
        HungryMode.getInstance().operation();
        DoubleCheckMode.getInstance().operation();
        EnumMode.INSTANTCE.operation();
        InnerClassMode.getInstance().operation();
    }

}
