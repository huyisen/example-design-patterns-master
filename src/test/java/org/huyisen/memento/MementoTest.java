package org.huyisen.memento;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:52
 * <p>Version: 1.0
 */
public class MementoTest {

    @Test
    public void testMemento(){
        CareTaker taker = new CareTaker();

        Emp emp = new Emp("高淇", 18, 900);
        System.out.println("第一次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        taker.setMemento(emp.memento());   //备忘一次

        emp.setAge(38);
        emp.setEname("搞起");
        emp.setSalary(9000);
        System.out.println("第二次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        emp.recovery(taker.getMemento()); //恢复到备忘录对象保存的状态

        System.out.println("第三次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
    }

}
