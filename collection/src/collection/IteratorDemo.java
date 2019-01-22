package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator():迭代器，集合的专用遍历方式
 * 		Object next():获取元素,并移动到下一个位置。
 * 			NoSuchElementException：没有这样的元素，因为你已经找到最后了。
 * 		boolean hasNext():如果仍有元素可以迭代，则返回 true。
 */
public class IteratorDemo {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();

        // 创建并添加元素
        // String s = "hello";
        // c.add(s);
        c.add("hello");
        c.add("world");
        c.add("java");

        // Iterator iterator():迭代器，集合的专用遍历方式
        Iterator it = c.iterator(); // 实际返回的肯定是子类对象，这里是多态
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
