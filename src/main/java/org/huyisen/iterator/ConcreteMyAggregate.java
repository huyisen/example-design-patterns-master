package org.huyisen.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 *
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:39
 * <p>Version: 1.0
 */
public class ConcreteMyAggregate {
    private List<Object> list = new ArrayList<Object>();

    public void addObject(Object obj){
        this.list.add(obj);
    }
    public void removeObject(Object obj){
        this.list.remove(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    //获得迭代器
    public Iterator  createIterator(){
        return new ConcreteIterator();
    }

    //使用内部类定义迭代器，可以直接使用外部类的属性
    private class ConcreteIterator implements Iterator {

        private int cursor;  //定义游标用于记录遍历时的位置

        public void first() {
            cursor = 0;
        }

        public Object getCurrentObj() {
            return list.get(cursor);
        }

        public boolean hasNext() {
            if(cursor<list.size()){
                return true;
            }
            return false;
        }

        public boolean isFirst() {
            return cursor==0?true:false;
        }

        public boolean isLast() {
            return cursor==(list.size()-1)?true:false;
        }

        public void next() {
            if(cursor<list.size()){
                cursor++;
            }
        }

    }
}
