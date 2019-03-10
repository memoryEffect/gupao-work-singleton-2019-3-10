
import lazysingleton.LazyInnerClassSingleton;
import lazysingleton.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 * Created by mzcsh on 2019/3/10.
 */
public class LazySingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Thread t1 =new Thread(new ExectorThread());
//        Thread t2 =new Thread(new ExectorThread());
//        t1.start();
//        t2.start();
//        System.out.println("End");

        /**
         * 反射破坏单例
         */

        Class<?> clazz =LazyInnerClassSingleton.class;
        //通过反射拿到私有构造方法
        Constructor c = clazz.getDeclaredConstructor(null);
        //强吻
        c.setAccessible(true);

        //暴力初始化
        //Object obj =c.newInstance();

        //调了两次构造方法
        Object obj1 =c.newInstance();

        //System.out.println(obj==obj1);

    }
}
