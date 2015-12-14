package org.huyisen.singleton;

/**
 * 测试静态内部类实现单例模式
 * 这种方式：线程安全，调用效率高，并且实现了延时加载！Singleton4
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-20 08:49
 * <p>Version: 1.0
 */
public class Singleton4 {
    private static class SingletonClassInstance {
        private static final Singleton4 instance = new Singleton4();
    }

    private Singleton4(){
    }

    //方法没有同步，调用效率高！
    public static Singleton4  getInstance(){
        return SingletonClassInstance.instance;
    }
}
