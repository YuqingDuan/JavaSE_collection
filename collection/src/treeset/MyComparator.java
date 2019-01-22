package treeset;

import collection.Employee;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

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
}
