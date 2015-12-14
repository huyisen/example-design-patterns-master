package org.huyisen.bridge;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-04 11:06
 * <p>Version: 1.0
 */
public class BridgeTest {

    @Test
    public void testBridge(){
        //销售联想的笔记本电脑
        Computer2  c = new Laptop2(new Lenovo());
        c.sale();

        //销售神舟的台式机
        Computer2 c2 = new Desktop2(new Shenzhou());
        c2.sale();
    }
}
