package com.example.design.clazz;

import com.example.design.HeadSet;
import com.example.design.UsbCPhone;

/**
 * UsbAdaptor.
 * usb转耳机
 * 类适配器，使用继承关系来实现
 * @author zhangteng 2/8/21
 */
public class UsbAdaptor extends UsbCPhone implements HeadSet {

    @Override
    public void charge() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void listenMusic() {
        System.out.println("听歌");
    }
}
