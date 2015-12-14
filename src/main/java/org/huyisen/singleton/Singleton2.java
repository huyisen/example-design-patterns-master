package org.huyisen.singleton;

/**
 * 测试懒汉式单例模式
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-20 08:49
 * <p>Version: 1.0
 */
public class Singleton2 {

    //类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
    private static Singleton2 instance;

    private Singleton2(){ //私有化构造器
    }

    //方法同步，调用效率低！
    public static  synchronized Singleton2  getInstance(){
        if(instance==null){
            instance = new Singleton2();
        }
        return instance;
    }
}
