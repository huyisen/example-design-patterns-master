package org.huyisen.observer.a;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:55
 * <p>Version: 1.0
 */
public class Subject {
    protected List<Observer> list = new ArrayList<Observer>();

    public void registerObserver(Observer obs){
        list.add(obs);
    }
    public void removeObserver(Observer obs){
        list.add(obs);
    }

    //通知所有的观察者更新状态
    public void notifyAllObservers(){
        for (Observer obs : list) {
            obs.update(this);
        }
    }
}
