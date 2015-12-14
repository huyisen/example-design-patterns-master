package org.huyisen.builder;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-30 08:50
 * <p>Version: 1.0
 */
public class BuilderTest {
    @Test
    public void testBuilder(){
        AirShipDirector director = new HysAirshipDirector(new HysAirShipBuilder());
        AirShip ship = director.directAirShip();
        System.out.println(ship.getEngine().getName());

        ship.launch();
    }
}
