package lazysingleton;

/**
 * Created by mzcsh on 2019/3/10.
 * 双重检查锁
 */
public class LazyDoubleCheckSingleton {
    private  static  LazyDoubleCheckSingleton lazyDoubleCheckSingleton =null;
    //私有构造方法
    private LazyDoubleCheckSingleton(){}

    //设置全局访问点，严格控制访问点
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton==null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }

            }
        }
        return lazyDoubleCheckSingleton;
    }
}
