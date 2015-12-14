package org.huyisen.facade;

/**
 * 税务局
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-08 08:52
 * <p>Version: 1.0
 */
public interface InlandRevenue {
    void taxCertificate();  //办理税务登记证
}
class LocalInlandRevenue implements InlandRevenue {

    public void taxCertificate() {
        System.out.println("在本地税务局办理税务登记证！");
    }

}