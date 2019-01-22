package list;

import java.util.Arrays;
import java.util.List;

/*
 * public static <T> List<T> asList(T... a):把数组转成集合
 *
 * 注意事项：
 * 		虽然可以把数组转成集合，但是集合的长度不能改变。
 */
public class ArraysDemo {
    public static void main(String[] args) {
        // 定义一个数组
        String[] strArray = {"hello", "world", "java"};
        List<String> list = Arrays.asList(strArray);

        // 遍历
        for (String s : list) {
            System.out.println(s);
        }
    }
}
