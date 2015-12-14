package org.huyisen.state;

/**
 * 已入住状态
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 13:04
 * <p>Version: 1.0
 */
public class CheckedInState implements State {
    public void handle() {
        System.out.println("房间已入住！请勿打扰！");
    }
}
