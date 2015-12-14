package org.huyisen.state;

/**
 * 已预订状态
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 13:04
 * <p>Version: 1.0
 */
public class BookedState implements State {
    public void handle() {
        System.out.println("房间已预订！别人不能定！");
    }
}
