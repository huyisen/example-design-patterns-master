package org.huyisen.command;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 09:03
 * <p>Version: 1.0
 */
public interface Command {
    /**
     * 这个方法是一个返回结果为空的方法。
     * 实际项目中，可以根据需求设计多个不同的方法
     */
    void execute();
}
class ConcreteCommand implements Command {

    private Receiver receiver;	//命令的真正的执行者

    public ConcreteCommand(Receiver receiver) {
        super();
        this.receiver = receiver;
    }

    public void execute() {
        //命令真正执行前或后，执行相关的处理！
        receiver.action();
    }

}