package org.huyisen.proxy.staticProxy;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-10 09:08
 * <p>Version: 1.0
 */
public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }

    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    public void sing() {
        star.sing();
    }
}
