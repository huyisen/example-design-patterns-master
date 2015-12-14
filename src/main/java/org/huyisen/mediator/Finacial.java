package org.huyisen.mediator;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:46
 * <p>Version: 1.0
 */
public class Finacial implements Department {
    private Mediator m;  //持有中介者(总经理)的引用

    public Finacial(Mediator m) {
        super();
        this.m = m;
        m.register("finacial", this);
    }

    public void outAction() {
        System.out.println("汇报工作！没钱了，钱太多了！怎么花?");
    }

    public void selfAction() {
        System.out.println("数钱！");
    }
}
