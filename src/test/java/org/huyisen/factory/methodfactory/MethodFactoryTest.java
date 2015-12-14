package org.huyisen.factory.methodfactory;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-26 08:50
 * <p>Version: 1.0
 */
public class MethodFactoryTest {

    @Test
    public void testMethodFactory(){

        Car car1 = new AudiFactory().createCar();
        Car car2 = new BydFactory().createCar();

        car1.run();
        car2.run();
    }

}
