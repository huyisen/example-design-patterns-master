package org.huyisen.mediator;

/**
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 12:44
 * <p>Version: 1.0
 */
public interface Mediator {
    void register(String dname,Department d);
    void command(String dname);
}
