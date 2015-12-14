package org.huyisen.factory.simplefactory;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-26 08:30
 * <p>Version: 1.0
 */
public class CarFactory {

    public static  Car createCar(String type){
        if("奥迪".equals(type)){
            return new Audi();
        }else if("比亚迪".equals(type)){
            return new Byd();
        }else{
            return null;
        }
    }

}

