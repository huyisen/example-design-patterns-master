package org.huyisen.observer.b;

import org.huyisen.observer.a.ConcreteSubject;
import org.huyisen.observer.a.ObserverB;
import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:57
 * <p>Version: 1.0
 */
public class ObserverTest {
    @Test
    public void testObserver(){
        //目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建多个观察者
        ObserverB obs1 = new ObserverB();
        ObserverB obs2 = new ObserverB();
        ObserverB obs3 = new ObserverB();

        //将这三个观察者添加到subject对象的观察者队伍中
        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);


        //改变subject的状态
        subject.setState(3000);
        System.out.println("########################");
        //我们看看，观察者的状态是不是也发生了变化
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

        //改变subject的状态
        subject.setState(30);
        System.out.println("########################");
        //我们看看，观察者的状态是不是也发生了变化
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
