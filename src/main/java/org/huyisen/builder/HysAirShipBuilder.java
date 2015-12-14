package org.huyisen.builder;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-30 08:48
 * <p>Version: 1.0
 */
public class HysAirShipBuilder implements AirShipBuilder{
    //StringBuilder, 以后学习XML解析中，JDOM库中的类：DomBuilder,SaxBuilder
    public Engine builderEngine() {
        System.out.println("构建胡义森牌发动机！");
        return new Engine("胡义森牌发动机！");
    }

    public EscapeTower builderEscapeTower() {

        System.out.println("构建逃逸塔");
        return new EscapeTower("胡义森牌逃逸塔");
    }

    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("胡义森牌轨道舱");
    }
}
