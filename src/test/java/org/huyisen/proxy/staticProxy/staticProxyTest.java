package org.huyisen.proxy.staticProxy;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-10 09:11
 * <p>Version: 1.0
 */
public class staticProxyTest {

    @Test
    public void testStaticProxy(){
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();

        proxy.collectMoney();
    }

}
