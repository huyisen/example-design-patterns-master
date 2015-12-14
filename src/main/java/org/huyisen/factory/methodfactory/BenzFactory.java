package org.huyisen.factory.methodfactory;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-27 08:56
 * <p>Version: 1.0
 */
public class BenzFactory implements CarFactory {
    public Car createCar() {
        return new Benz();
    }
}
