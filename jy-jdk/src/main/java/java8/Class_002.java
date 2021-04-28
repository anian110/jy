package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName Class_002
 * @Description
 * @Author ANIAN
 * @Date 2021/4/26 下午4:32
 * @Version V1.0
 **/

public class Class_002 {

    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("red" , 80));
        list.add(new Apple("greed" , 60));
        list.add(new Apple("blue" , 100));
        list.add(new Apple("red" , 120));
        List<Apple> result = new ArrayList<>();

        //使用一般遍历选出 red 苹果
//        for (Apple apple : list) {
//            if ("red".equals(apple.getColor())) {
//                result.add(apple);
//            }
//        }
        //方法引用
//        List<Apple> apples = filterApples(list, Class_002::isRedApple);
//        List<Apple> apples = filterApples(list, (Apple a) -> "red".equals(a.getColor()));

        sout(list , (Apple a) -> a.toString());

//        apples.forEach(System.out::println);
    }

    public static boolean isRedApple(Apple apple){
        return "red".equals(apple.getColor());
    }
    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight() > 150;
    }

    public interface Predicate<T>{
        boolean test(T t);
    }

    static  List<Apple> filterApples(List<Apple> list , Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        //使用一般遍历选出 red 苹果
        for (Apple apple : list) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    static void sout(List<Apple> list , SoutString<Apple> p){
        for (Apple apple : list) {
            String sout = p.sout(apple);
            System.out.println(sout);
        }
    }

}
interface SoutString<T>{
    String sout(Apple apple);
}

class Apple{
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}