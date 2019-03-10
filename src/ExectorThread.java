import lazysingleton.LazyDoubleCheckSingleton;
import lazysingleton.LazySingleton;

/**
 * Created by mzcsh on 2019/3/10.
 */
public class ExectorThread implements Runnable{


    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton =  LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() +":"+lazyDoubleCheckSingleton);
    }
}
