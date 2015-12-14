package org.huyisen.builder;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-30 08:44
 * <p>Version: 1.0
 */
public interface AirShipBuilder {
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower  builderEscapeTower();
}
