package org.huyisen.prototype;

import org.junit.Test;

import java.io.*;
import java.util.Date;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-11-30 09:08
 * <p>Version: 1.0
 */
public class PrototypeTest {

    /**
     * 测试原型模式(浅克隆)
     */
    @Test
    public void testPrototype() throws CloneNotSupportedException {
        Date date = new Date(12312321331L);
        Sheep s1 = new Sheep("少利",date);
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

        date.setTime(23432432423L);

        System.out.println(s1.getBirthday());

        Sheep s2 = (Sheep) s1.clone();
        s2.setSname("多利");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }

    /**
     * 原型模式(深复制)
     */
    @Test
    public void testPrototype1() throws CloneNotSupportedException{
        Date date = new Date(12312321331L);
        Sheep1 s1 = new Sheep1("少利",date);
        Sheep1 s2 = (Sheep1) s1.clone();   //实现深复制。s2对象的birthday是一个新对象！

        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

        date.setTime(23432432423L);

        System.out.println(s1.getBirthday());


        s2.setSname("多利");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }

    /**
     * 原型模式(深复制,使用序列化和反序列化的方式实现深复制)
     */
    @Test
    public void testPrototype2 () throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Date date = new Date(12312321331L);
        Sheep s1 = new Sheep("少利",date);
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());


//		使用序列化和反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream	  ois = new ObjectInputStream(bis);

        Sheep s2 = (Sheep) ois.readObject();   //克隆好的对象！

        System.out.println("修改原型对象的属性值");
        date.setTime(23432432423L);

        System.out.println(s1.getBirthday());

        s2.setSname("多利");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }

    @Test
    public void testCloneAndNew() throws CloneNotSupportedException {
        testNew(1000);
        testClone(1000);
    }


    public static void testNew(int size){
        long start = System.currentTimeMillis();
        for(int i=0;i<size;i++){
            Laptop t = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("new的方式创建耗时："+(end-start));
    }

    public static void testClone(int size) throws CloneNotSupportedException{
        long start = System.currentTimeMillis();
        Laptop t = new Laptop();
        for(int i=0;i<size;i++){
            Laptop temp = (Laptop) t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("clone的方式创建耗时："+(end-start));
    }


}
class Laptop implements Cloneable {  //笔记本电脑
    public Laptop() {
        try {
            Thread.sleep(10);  //模拟创建对象耗时的过程!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();  //直接调用object对象的clone()方法！
        return obj;
    }

}