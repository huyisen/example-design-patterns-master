package org.huyisen.state;

/**
 * 空闲状态
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 13:03
 * <p>Version: 1.0
 */
public class FreeState implements State {
    public void handle() {
        System.out.println("房间空闲！！！没人住！");
    }
}
