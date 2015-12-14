package org.huyisen.strategy;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 13:11
 * <p>Version: 1.0
 */
public class NewCustomerManyStrategy implements Strategy {
    public double getPrice(double standardPrice) {
        System.out.println("打九折");
        return standardPrice*0.9;
    }
}
