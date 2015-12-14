package org.huyisen.adapter;

/**
 * 适配器 (类适配器方式)
 * (相当于usb和ps/2的转接器)
 *
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-01 08:55
 * <p>Version: 1.0
 */
public class Adapter extends Adaptee implements Target {
    public void handleReq() {
        super.request();
    }
}
