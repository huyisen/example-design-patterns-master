package org.huyisen.factory.simplefactory;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-26 08:40
 * <p>Version: 1.0
 */
public class CarFactory1 {

    public static  Car createAudi(){
        return new Audi();
    }
    public static  Car createByd(){
        return new Byd();
    }

}
