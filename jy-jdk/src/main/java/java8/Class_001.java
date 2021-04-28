package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Class_001
 * @Description
 * @Author ANIAN
 * @Date 2021/4/23 上午11:34
 * @Version V1.0
 **/
public class Class_001 {
    public static void main(String[] args) {

        //使用比较原始的方法进行排序
        List<Integer> list = Arrays.asList(3, 2, 6, 1, 9, 3, 11, 3, 5);
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 -o2;
//            }
//        });

        //使用java8方法，进行排序
//        list.sort(Integer::compareTo); //顺序

        list.sort(((o1, o2) -> o2 - o1));//逆序
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
