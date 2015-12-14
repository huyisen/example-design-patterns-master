package org.huyisen.observer.b;

import java.util.Observable;

/**
 *目标对象
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:59
 * <p>Version: 1.0
 */
public class ConcreteSubject extends Observable {

    private int state;

    public void set(int s){
        state = s;  //目标对象的状态发生了改变

        setChanged();  //表示目标对象已经做了更改
        notifyObservers(state);  //通知所有的观察者

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
