package org.huyisen.iterator;

/**
 * 自定义的迭代器接口
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:39
 * <p>Version: 1.0
 */
public interface Iterator {
    void first();	//将游标指向第一个元素
    void next();	//将游标指向下一个元素
    boolean hasNext();//判断是否存在下一个元素

    boolean isFirst();
    boolean isLast();

    Object getCurrentObj();  //获取当前游标指向的对象
}
