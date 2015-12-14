package org.huyisen.flyweight;

/**
 * 享元类
 *
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-10 09:01
 * <p>Version: 1.0
 */
public interface ChessFlyWeight {
    void setColor(String c);
    String getColor();
    void display(Coordinate c);
}
class ConcreteChess implements ChessFlyWeight {

    private String color;

    public ConcreteChess(String color) {
        super();
        this.color = color;
    }

    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置："+c.getX()+"----"+c.getY());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

}