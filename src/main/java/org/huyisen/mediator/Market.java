package org.huyisen.mediator;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:47
 * <p>Version: 1.0
 */
public class Market implements Department {
    private Mediator m;  //持有中介者(总经理)的引用

    public Market(Mediator m) {
        super();
        this.m = m;
        m.register("market", this);
    }

    public void outAction() {
        System.out.println("汇报工作！项目承接的进度，需要资金支持！");

        m.command("finacial");

    }

    public void selfAction() {
        System.out.println("跑去接项目！");
    }
}
