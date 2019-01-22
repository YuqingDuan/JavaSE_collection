package treeset;

import collection.Pupil;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台
 *
 * 分析：
 * 		A:定义学生Pupil类
 * 		B:创建一个TreeSet集合
 * 		C:总分从高到底如何实现呢?
 * 		D:键盘录入5个学生信息
 * 		E:遍历TreeSet集合
 */
public class TreeSetDemo4 {
    public static void main(String[] args) {
        // 创建一个TreeSet集合
        TreeSet<Pupil> ts = new TreeSet<>(new Comparator<Pupil>() {
            public int compare(Pupil p1, Pupil p2) {
                // 总分从高到低
                int num = p2.getSum() - p1.getSum();
                // 总分相同的不一定语文相同
                int num2 = num == 0 ? p1.getChinese() - p2.getChinese() : num;
                // 总分相同的不一定数序相同
                int num3 = num2 == 0 ? p1.getMath() - p2.getMath() : num2;
                // 总分相同的不一定英语相同
                int num4 = num3 == 0 ? p1.getEnglish() - p2.getEnglish() : num3;
                // 姓名还不一定相同呢
                int num5 = num4 == 0 ? p1.getName().compareTo(p2.getName())
                        : num4;
                return num5;
            }
        });

        System.out.println("学生信息录入开始");
        // 键盘录入5个学生信息
        for (int x = 1; x <= 5; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + x + "个学生的姓名:");
            String name = sc.nextLine();
            System.out.println("请输入第" + x + "个学生的语文成绩:");
            String chineseString = sc.nextLine();
            System.out.println("请输入第" + x + "个学生的数学成绩:");
            String mathString = sc.nextLine();
            System.out.println("请输入第" + x + "个学生的英语成绩:");
            String englishString = sc.nextLine();

            // 把数据封装到学生对象中
            Pupil p = new Pupil();
            p.setName(name);
            p.setChinese(Integer.parseInt(chineseString));
            p.setMath(Integer.parseInt(mathString));
            p.setEnglish(Integer.parseInt(englishString));

            // 把学生对象添加到集合
            ts.add(p);
        }
        System.out.println("学生信息录入完毕");

        System.out.println("学习信息从高到低排序如下：");
        System.out.println("姓名\t语文成绩\t数学成绩\t英语成绩");

        // 遍历集合
        for (Pupil p : ts) {
            System.out.println(p.getName() + "\t" + p.getChinese() + "\t"
                    + p.getMath() + "\t" + p.getEnglish());
        }
    }
}
