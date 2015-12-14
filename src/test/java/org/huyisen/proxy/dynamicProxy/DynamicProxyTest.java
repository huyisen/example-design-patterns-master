package org.huyisen.proxy.dynamicProxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-10 09:17
 * <p>Version: 1.0
 */
public class DynamicProxyTest {

    @Test
    public void testDynamicProxy(){
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);

        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Star.class}, handler);

        proxy.sing();
    }
}
