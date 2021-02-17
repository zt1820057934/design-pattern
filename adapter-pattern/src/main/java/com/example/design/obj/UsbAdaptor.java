package com.example.design.obj;

import com.example.design.HeadSet;
import com.example.design.UsbCPhone;

/**
 * UsbAdaptor.
 * usb转耳机
 * 对象适配器，使用组合关系来实现
 * @author zhangteng 2/8/21
 */
public class UsbAdaptor implements HeadSet {

    private UsbCPhone usbCPhone;

    public UsbAdaptor(UsbCPhone phone) {
        this.usbCPhone = phone;
    }

    public void listenMusic() {
        System.out.println("听歌");
    }

    public void charge() {
        // usbCPhone.charge();
        throw new UnsupportedOperationException();
    }

}
