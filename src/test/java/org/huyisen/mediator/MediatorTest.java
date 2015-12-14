package org.huyisen.mediator;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:49
 * <p>Version: 1.0
 */
public class MediatorTest {

    @Test
    public void testMediator(){
        Mediator m = new President();

        Market   market = new Market(m);
        Development devp = new Development(m);
        Finacial f = new Finacial(m);

        market.selfAction();
        market.outAction();
    }
}
