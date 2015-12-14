package org.huyisen.command;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 09:05
 * <p>Version: 1.0
 */
public class CommandTest {

    @Test
    public void testCommand(){
        Command c = new ConcreteCommand(new Receiver());
        Invoke i = new Invoke(c);
        i.call();


//		new Receiver().action();
    }
}
