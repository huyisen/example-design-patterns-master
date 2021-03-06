package org.huyisen.observer.a;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:55
 * <p>Version: 1.0
 */
public class ObserverB implements Observer {
    private int myState;   //myState需要跟目标对象的state值保持一致！


    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }


    public int getMyState() {
        return myState;
    }
    public void setMyState(int myState) {
        this.myState = myState;
    }
}
