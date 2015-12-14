package org.huyisen.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:48
 * <p>Version: 1.0
 */
public class President implements Mediator {
    private Map<String,Department> map = new HashMap<String , Department>();

    public void command(String dname) {
        map.get(dname).selfAction();
    }

    public void register(String dname, Department d) {
        map.put(dname, d);
    }
}
