package org.huyisen.facade;

/**
 * 质检局
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-08 08:56
 * <p>Version: 1.0
 */
public interface SupervisionBureau {
    void  orgCodeCertificate();  //办理组织机构代码证
}
class LocalSupervisionBureau implements SupervisionBureau{

    public void orgCodeCertificate() {
        System.out.println("在本地质检局办理组织机构代码证！");
    }
}