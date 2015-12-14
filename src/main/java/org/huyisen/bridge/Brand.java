package org.huyisen.bridge;

/**
 * 品牌
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-04 10:56
 * <p>Version: 1.0
 */
public interface Brand {
    void sale();
}
class Lenovo implements Brand {

    public void sale() {
        System.out.println("销售联想电脑");
    }

}

class Dell implements Brand {

    public void sale() {
        System.out.println("销售Dell电脑");
    }

}

class Shenzhou implements Brand {

    public void sale() {
        System.out.println("销售神舟电脑");
    }

}