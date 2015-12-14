package org.huyisen.proxy.dynamicProxy;

import org.huyisen.proxy.staticProxy.Star;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-10 09:08
 * <p>Version: 1.0
 */
public class ProxyStar implements org.huyisen.proxy.staticProxy.Star {

    private StarHandler handler;

    public ProxyStar(StarHandler handler) {
        this.handler = handler;
    }

    public void bookTicket() {
//		handler.invoke(this,当前方法 , args);
    }

    public void collectMoney() {
//		handler.invoke(this,当前方法 , args);
    }

    public void confer() {
//		handler.invoke(this,当前方法 , args);
    }

    public void signContract() {
//		handler.invoke(this,当前方法 , args);
    }

    public void sing() {
//		handler.invoke(this,当前方法 , args);
    }
}
