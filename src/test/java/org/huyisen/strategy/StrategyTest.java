package org.huyisen.strategy;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 13:08
 * <p>Version: 1.0
 */
public class StrategyTest {

    @Test
    public void testStrategy(){
        Strategy s1 = new OldCustomerManyStrategy();
        Context ctx = new Context(s1);

        ctx.pringPrice(998);

    }

}
