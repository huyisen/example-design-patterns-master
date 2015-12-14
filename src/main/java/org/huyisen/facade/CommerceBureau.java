package org.huyisen.facade;

/**
 * 工商局
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-08 08:50
 * <p>Version: 1.0
 */
public interface CommerceBureau {
    void checkName();  //核名
}

class LocalCommerceBureau implements CommerceBureau {
    public void checkName() {
        System.out.println("检查名字是否有冲突！");
    }
}