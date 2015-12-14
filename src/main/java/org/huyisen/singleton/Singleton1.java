package org.huyisen.singleton;

/**
 *  测试饿汉式单例模式
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-20 08:49
 * <p>Version: 1.0
 */
public class Singleton1 {

    //类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
    private static final Singleton1 instance = new Singleton1();

    public Singleton1() {
    }

    //方法没有同步，调用效率高！
    public static Singleton1  getInstance(){
        return instance;
    }
}
