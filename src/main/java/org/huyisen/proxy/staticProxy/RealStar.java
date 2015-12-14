package org.huyisen.proxy.staticProxy;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-10 09:06
 * <p>Version: 1.0
 */
public class RealStar implements Star {
    public void confer() {
        System.out.println("RealStar.bookTicket()");
    }

    public void signContract() {
        System.out.println("RealStar.collectMoney()");
    }

    public void bookTicket() {
        System.out.println("RealStar.confer()");
    }

    public void sing() {
        System.out.println("RealStar.signContract()");
    }

    public void collectMoney() {
        System.out.println("RealStar(周杰伦本人).sing()");
    }
}
