package org.huyisen.templateMethod;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 08:51
 * <p>Version: 1.0
 */
public abstract class BankTemplateMethod {
    //具体方法
    public void takeNumber(){
        System.out.println("取号排队");
    }

    public abstract void transact(); //办理具体的业务	//钩子方法

    public void evaluate(){
        System.out.println("反馈评分");
    }



    public final void process(){	//模板方法！！！
        this.takeNumber();

        this.transact();

        this.evaluate();
    }
}
class DrawMoney extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("我要取款！！！");
    }

}