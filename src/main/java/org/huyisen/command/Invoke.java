package org.huyisen.command;

/**
 * //调用者/发起者
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 09:04
 * <p>Version: 1.0
 */
public class Invoke {
    private Command command;   //也可以通过容器List<Command>容纳很多命令对象，进行批处理。数据库底层的事务管理就是类似的结构！

    public Invoke(Command command) {
        super();
        this.command = command;
    }

    //业务方法 ，用于调用命令类的方法
    public void call(){
        command.execute();
    }
}
