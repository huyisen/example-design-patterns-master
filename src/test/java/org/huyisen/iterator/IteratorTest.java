package org.huyisen.iterator;

import org.junit.Test;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:41
 * <p>Version: 1.0
 */
public class IteratorTest {

    @Test
    public  void TestIterator(){
        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");

        Iterator iter = cma.createIterator();
        while(iter.hasNext()){
            System.out.println(iter.getCurrentObj());
            iter.next();
        }

    }
}
