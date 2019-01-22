package linkedlist;

import java.util.LinkedList;

/**
 * 自定义的栈集合
 *
 * @author Yuqing Duan
 * @version V1.0
 */
public class MyStack {
    private LinkedList link;

    public MyStack() {
        link = new LinkedList();
    }

    public void add(Object obj) {
        link.addFirst(obj);
    }

    public Object get() {
        // return link.getFirst();
        return link.removeFirst();
    }

    public boolean isEmpty() {
        return link.isEmpty();
    }
}
