package org.huyisen.factory.abstractfactory;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-27 09:08
 * <p>Version: 1.0
 */
public class LowCarFactory implements CarFactory {

    public Engine createEngine() {
        return new LowEngine();
    }

    public Seat createSeat() {
        return new LowSeat();
    }

    public Tyre createTyre() {
        return new LowTyre();
    }
}
