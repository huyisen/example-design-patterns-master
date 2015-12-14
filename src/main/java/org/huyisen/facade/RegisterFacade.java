package org.huyisen.facade;

/**
 * 办理注册公司流程的门面对象
 * <p/>
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-08 09:02
 * <p>Version: 1.0
 */
public class RegisterFacade {
    public void register() {

        CommerceBureau a = new LocalCommerceBureau();
        a.checkName();
        SupervisionBureau b = new LocalSupervisionBureau();
        b.orgCodeCertificate();
        InlandRevenue c = new LocalInlandRevenue();
        c.taxCertificate();
        Bank bank = new ICBC();
        bank.openAccount();
    }
}
