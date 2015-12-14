package org.huyisen.memento;

/**
 * 负责人类
 * 负责管理备忘录对象
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:52
 * <p>Version: 1.0
 */
public class CareTaker {
    private EmpMemento memento;

//	private List<EmpMemento> list = new ArrayList<EmpMemento>();



    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
