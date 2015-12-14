package org.huyisen.flyweight;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-10 09:03
 * <p>Version: 1.0
 */
public class FlyweightTest {

    @Test
    public void testFlyweight(){
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加外部状态的处理===========");
        chess1.display(new Coordinate(10, 10));
        chess2.display(new Coordinate(20, 20));
    }

}
