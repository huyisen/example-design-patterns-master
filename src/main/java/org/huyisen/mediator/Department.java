package org.huyisen.mediator;

/**
 * 同事类的接口
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:45
 * <p>Version: 1.0
 */
public interface Department {
    void selfAction(); //做本部门的事情
    void outAction();  //向总经理发出申请
}
