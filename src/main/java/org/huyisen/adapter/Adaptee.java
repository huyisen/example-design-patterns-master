package org.huyisen.adapter;

/**
 *  被适配的类
 * (相当于例子中的，PS/2键盘)
 *
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-01 08:54
 * <p>Version: 1.0
 */
public class Adaptee {
    public void request(){
        System.out.println("可以完成客户请求的需要的功能！");
    }
}
