package org.huyisen.templateMethod;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 08:53
 * <p>Version: 1.0
 */
public class templateMethodTest {

    @Test
    public void testTemplateMethod(){
        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        //采用匿名内部类
        BankTemplateMethod btm2 = new BankTemplateMethod() {

            @Override
            public void transact() {
                System.out.println("我要存钱！");
            }
        };
        btm2.process();

        BankTemplateMethod btm3 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要理财！我这里有2000万韩币");
            }
        };

        btm3.process();

    }
}
