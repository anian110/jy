package proxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyTest
 * @Description
 * @Author ANIAN
 * @Date 2021/1/21 4:12 下午
 * @Version V1.0
 **/
public class ProxyTest {
    public static void main(String[] args) {

        IntegerHandler handler = new IntegerHandler(1);
        Comparable instance = (Comparable)Proxy.newProxyInstance(null, new Class[]{Comparable.class}, handler);
        int compareTo = instance.compareTo(3);
        System.out.println(compareTo);
    }
}
