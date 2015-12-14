package org.huyisen.adapter;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-01 08:55
 * <p>Version: 1.0
 */
public class Adapter2 implements Target {
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    public void handleReq() {
        adaptee.request();
    }

}
