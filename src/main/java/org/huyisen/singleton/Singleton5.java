package org.huyisen.singleton;

/**
 *测试枚举式实现单例模式(没有延时加载)
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-20 08:49
 * <p>Version: 1.0
 */
public enum Singleton5 {

    //这个枚举元素，本身就是单例对象！
    INSTANCE;

    //添加自己需要的操作！
    public void singletonOperation(){
    }
}
