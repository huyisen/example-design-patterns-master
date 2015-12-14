package org.huyisen.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;

/**
 *  测试饿汉式单例模式
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-20 08:49
 * <p>Version: 1.0
 */
public class SingletonTest {

    /**测试单例模式。*/
    @Test
    public void testSingleton(){

        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        Assert.assertEquals("s1和s2 不行等",s1,s2);
        Assert.assertEquals(" Singleton5.INSTANCE 和 Singleton5.INSTANCE 不行等",Singleton5.INSTANCE,Singleton5.INSTANCE);
    }

    /**
     * 测试反射和序列化单例模式漏洞。
     *
     * @throws Exception 异常
     */
    @Test
    public void testSingleton1() throws Exception {
        Singleton6 s1 = Singleton6.getInstance();
        Singleton6 s2 = Singleton6.getInstance();
        Assert.assertEquals("s1和s2 不行等",s1,s2);

        Class<Singleton6> clazz = (Class<Singleton6>) Class.forName("org.huyisen.singleton.Singleton6");
        Constructor<Singleton6> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Singleton6 s3 = constructor.newInstance();
        Singleton6 s4 = constructor.newInstance();
        Assert.assertEquals(" s3 和 s4 不相等",s3,s4);

        //通过反序列化的方式构造多个对象
        FileOutputStream fos = new FileOutputStream("d:/test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/test.txt"));
        Singleton6 s5 =  (Singleton6) ois.readObject();
        Assert.assertEquals("s1和s5不是同一个对象",s5,s1);

    }

    /**
     * 测试多线程环境下五种创建单例模式的效率。
     *
     * @throws Exception 异常
     */
    @Test
    public void testSingleton2() throws Exception {
        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for(int i=0;i<threadNum;i++){
            new Thread(new Runnable() {
                public void run() {
                    for(int i=0;i<1000000;i++){
                        Object o = Singleton5.INSTANCE;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行！
        long end = System.currentTimeMillis();
        System.out.println("总耗时："+(end-start));

    }


}
