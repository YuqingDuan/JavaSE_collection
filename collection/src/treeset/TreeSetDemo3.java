package treeset;

import collection.Employee;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 需求：请按照姓名的长度排序
 *
 * TreeSet集合保证元素排序和唯一性的原理
 * 唯一性：是根据比较的返回是否是0来决定。
 * 排序：
 * 		A:自然排序(元素具备比较性)
 * 			让元素所属的类实现自然排序接口 Comparable
 * 		B:比较器排序(集合具备比较性)
 * 			让集合的构造方法接收一个比较器接口的子类对象 Comparator
 */
public class TreeSetDemo3 {
    public static void main(String[] args) {
        // 创建集合对象
        // 匿名内部类
        // TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());
        TreeSet<Employee> ts = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                // 姓名长度
                int num = e1.getName().length() - e2.getName().length();
                // 姓名内容
                int num2 = num == 0 ? e1.getName().compareTo(e2.getName()) : num;
                // 年龄
                int num3 = num2 == 0 ? e1.getAge() - e2.getAge() : num2;
                return num3;
            }
        });

        // 创建元素
        Employee s1 = new Employee("linqingxia", 27);
        Employee s2 = new Employee("zhangguorong", 29);
        Employee s3 = new Employee("wanglihong", 23);
        Employee s4 = new Employee("linqingxia", 27);
        Employee s5 = new Employee("liushishi", 22);
        Employee s6 = new Employee("wuqilong", 40);
        Employee s7 = new Employee("fengqingy", 22);
        Employee s8 = new Employee("linqingxia", 29);

        // 添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);
        ts.add(s8);

        // 遍历
        for (Employee e : ts) {
            System.out.println(e.getName() + "---" + e.getAge());
        }
    }
}
