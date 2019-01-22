package linkedlist;

/*
 * MyStack的测试
 */
public class MyStackDemo {
    public static void main(String[] args) {
        // 创建集合对象
        MyStack ms = new MyStack();

        // 添加元素
        ms.add("hello");
        ms.add("world");
        ms.add("java");

        // 遍历
        while (!ms.isEmpty()) {
            System.out.println(ms.get());
        }
    }
}
