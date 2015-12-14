package org.huyisen.factory.abstractfactory;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-27 09:06
 * <p>Version: 1.0
 */
public interface Seat {
    void massage();
}
class LuxurySeat implements Seat {

    public void massage() {
        System.out.println("可以自动按摩！");
    }

}
class LowSeat implements Seat {

    public void massage() {
        System.out.println("不能按摩！");
    }

}