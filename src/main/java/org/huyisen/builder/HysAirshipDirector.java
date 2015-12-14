package org.huyisen.builder;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-30 08:46
 * <p>Version: 1.0
 */
public class HysAirshipDirector implements AirShipDirector{
    private AirShipBuilder builder;

    public HysAirshipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }
    public AirShip directAirShip() {
        Engine e = builder.builderEngine();
        OrbitalModule o = builder.builderOrbitalModule();
        EscapeTower et = builder.builderEscapeTower();

        //装配成飞船对象
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(o);

        return ship;
    }

}
