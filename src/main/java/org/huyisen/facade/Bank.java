package org.huyisen.facade;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-08 08:54
 * <p>Version: 1.0
 */
public interface Bank {
    void  openAccount();  //开户
}
class ICBC implements Bank{

    public void openAccount() {
        System.out.println("在中国工商银行开户！");
    }
}