import lazysingleton.TheadLocalSingleton;

/**
 * Created by mzcsh on 2019/3/11.
 */
public class TheadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(TheadLocalSingleton.getInstance());
        System.out.println(TheadLocalSingleton.getInstance());
        System.out.println(TheadLocalSingleton.getInstance());
        System.out.println(TheadLocalSingleton.getInstance());
        System.out.println(TheadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();
        System.out.println("End");

    }
}
