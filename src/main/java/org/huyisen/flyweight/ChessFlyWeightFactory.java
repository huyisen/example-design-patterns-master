package org.huyisen.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 *
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-10 09:00
 * <p>Version: 1.0
 */
public class ChessFlyWeightFactory {
    //享元池
    private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();

    public static ChessFlyWeight  getChess(String color){

        if(map.get(color)!=null){
            return map.get(color);
        }else{
            ChessFlyWeight cfw = new ConcreteChess(color);
            map.put(color, cfw);
            return cfw;
        }

    }

}
