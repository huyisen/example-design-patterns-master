package org.huyisen.memento;

/**
 *  备忘录类
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:50
 * <p>Version: 1.0
 */
public class EmpMemento {
    private String ename;
    private int age;
    private double salary;


    public EmpMemento(Emp e) {
        this.ename = e.getEname();
        this.age = e.getAge();
        this.salary = e.getSalary();
    }


    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
