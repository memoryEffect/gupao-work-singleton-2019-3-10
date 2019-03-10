package lazysingleton;

/**
 * Created by mzcsh on 2019/3/10.
 * 懒加载：只有被调用的时候才加载
 */
public class LazySingleton {

    private static   LazySingleton lazySingleton = null;

    //私有构造器
    private LazySingleton(){}

    //设置全局访问点，严格控制访问
    //在方法上加同步锁synochronized时，如果出现大量的线程在访问，cpu分配压力上升，会使多数线程处于阻塞状态，会导致性能下降
    //这个时候应该使用双重检查锁
    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
