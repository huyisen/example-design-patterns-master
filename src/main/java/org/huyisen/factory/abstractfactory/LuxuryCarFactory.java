package org.huyisen.factory.abstractfactory;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-27 09:09
 * <p>Version: 1.0
 */
public class LuxuryCarFactory implements CarFactory {
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    public Seat createSeat() {
        return new LuxurySeat();
    }

    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
