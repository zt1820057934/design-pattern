package com.example.design.clazz;

import com.example.design.UsbCPhone;

/**
 * Use.
 *
 * @author zhangteng 2/8/21
 */
public class Use {

    public static void main(String[] args) {
        UsbCPhone phone = new UsbCPhone();
        phone.charge();
        // phone.listenMusic();  error
        UsbAdaptor adaptor = new UsbAdaptor();
        adaptor.listenMusic();
        // adaptor.charge();     error
    }

}
