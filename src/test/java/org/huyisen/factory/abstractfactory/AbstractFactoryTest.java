package org.huyisen.factory.abstractfactory;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-26 08:50
 * <p>Version: 1.0
 */
public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory(){

        CarFactory carFactory = new LuxuryCarFactory();
        Engine engine = carFactory.createEngine();
        engine.run();
        engine.start();

    }

}
