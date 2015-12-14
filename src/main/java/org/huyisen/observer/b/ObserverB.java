package org.huyisen.observer.b;

import java.util.Observable;
import java.util.Observer;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:58
 * <p>Version: 1.0
 */
public class ObserverB implements Observer {
    private int myState;

    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject)o).getState();
    }


    public int getMyState() {
        return myState;
    }


    public void setMyState(int myState) {
        this.myState = myState;
    }
}
