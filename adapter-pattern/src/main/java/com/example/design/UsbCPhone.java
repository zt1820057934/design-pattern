package com.example.design;

/**
 * UsbCPhone.
 * 只有usb-c的手机
 * @author zhangteng 2/8/21
 */
public class UsbCPhone {

    public void charge() {
        System.out.println("充电");
    }

    public void listenMusic() {
        throw new UnsupportedOperationException();
    }

}
