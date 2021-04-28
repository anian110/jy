package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName IntegerHandler
 * @Description
 * @Author ANIAN
 * @Date 2021/1/21 4:06 下午
 * @Version V1.0
 **/
public class IntegerHandler implements InvocationHandler {

    private Object t;

    public IntegerHandler(Object t) {
        this.t = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("==============");
        return method.invoke(t , args);
    }
}
