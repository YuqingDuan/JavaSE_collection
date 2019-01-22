package collection;

import java.util.Objects;

/*
 * 如果一个类的元素要想能够进行自然排序，就必须实现自然排序接口
 */
public class Student implements Comparable<Student> {
    // 成员变量
    private String name;
    private int age;

    // 构造方法
    public Student() {
        super();
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // 成员方法
    // getXxx()/setXxx()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student s) {
        // 这里返回什么，其实应该根据我的排序规则来做
        // 按照年龄排序,主要条件
        int num = this.age - s.age;
        // 次要条件
        // 年龄相同的时候，还得去看姓名是否也相同
        // 如果年龄和姓名都相同，才是同一个元素
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;
        return num2;
    }

    // @Override
    // public int compareTo(Student s) {
    //     // 主要条件 姓名的长度
    //     int num = this.name.length() - s.name.length();
    //     // 姓名的长度相同，不代表姓名的内容相同
    //     int num2 = num == 0 ? this.name.compareTo(s.name) : num;
    //     // 姓名的长度和内容相同，不代表年龄相同，所以还得继续判断年龄
    //     int num3 = num2 == 0 ? this.age - s.age : num2;
    //     return num3;
    // }
}
