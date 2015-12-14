package org.huyisen.state;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 13:05
 * <p>Version: 1.0
 */
public class StateTest {

    @Test
    public void testState(){
        HomeContext ctx = new HomeContext();

        ctx.setState(new FreeState());
        ctx.setState(new BookedState());
    }
}
