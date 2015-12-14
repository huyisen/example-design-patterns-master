package org.huyisen.flyweight;

/**
 * 外部状态UnSharedConcreteFlyWeight
 *
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-10 08:57
 * <p>Version: 1.0
 */
public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
