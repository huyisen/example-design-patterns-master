package org.huyisen.adapter;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-01 08:58
 * <p>Version: 1.0
 */
public class AdapterTest {

    @Test
    public void testAdapter(){
        Client  c = new Client();
        Adaptee a = new Adaptee();

//		Target t = new Adapter();
        Target t = new Adapter2(a);

        c.test1(t);

    }

}
class Client {
    public void test1(Target t){
        t.handleReq();
    }
}