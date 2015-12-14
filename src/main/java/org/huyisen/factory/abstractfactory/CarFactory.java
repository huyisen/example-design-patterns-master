package org.huyisen.factory.abstractfactory;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-27 09:04
 * <p>Version: 1.0
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
