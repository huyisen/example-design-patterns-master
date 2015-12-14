package org.huyisen.composite;

/**
 * 抽象组件
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-04 11:14
 * <p>Version: 1.0
 */
public interface Component {
    void operation();
}
//叶子组件
interface Leaf extends Component {
}
//容器组件
interface Composite extends Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
}