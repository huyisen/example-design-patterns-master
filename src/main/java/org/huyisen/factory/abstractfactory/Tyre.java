package org.huyisen.factory.abstractfactory;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-27 09:07
 * <p>Version: 1.0
 */
public interface Tyre {
    void revolve();
}
class LuxuryTyre implements Tyre {

    public void revolve() {
        System.out.println("旋转不磨损！");
    }

}

class LowTyre implements Tyre {

    public void revolve() {
        System.out.println("旋转磨损快！");
    }

}