package org.huyisen.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例模式(如何防止反射和反序列化漏洞)
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-20 08:49
 * <p>Version: 1.0
 */
public class Singleton6 implements Serializable {
    //类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
    private static Singleton6 instance;

    private Singleton6(){ //私有化构造器
        if(instance!=null){
            throw new RuntimeException("构造器已经私有，不可以通过反射创建对象。");
        }
    }

    //方法同步，调用效率低！
    public static  synchronized Singleton6  getInstance(){
        if(instance==null){
            instance = new Singleton6();
        }
        return instance;
    }

    //反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建新对象！
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
