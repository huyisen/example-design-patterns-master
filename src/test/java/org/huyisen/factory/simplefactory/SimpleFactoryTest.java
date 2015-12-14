package org.huyisen.factory.simplefactory;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-26 08:50
 * <p>Version: 1.0
 */
public class SimpleFactoryTest {

    @Test
    public void testNoFactory(){
        Car car1 = new Audi();
        Car car2 = new Byd();

        car1.run();
        car2.run();
    }

    @Test
    public void testSimpleFactory(){
        Car car1 = CarFactory.createCar("奥迪");
        Car car2 = CarFactory.createCar("比亚迪");

        car1.run();
        car2.run();
    }


}
