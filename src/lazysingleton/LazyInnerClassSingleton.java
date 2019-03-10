package lazysingleton;

/**
 * Created by mzcsh on 2019/3/10.
 *静态内部类方式
 *及避免了饿汉式的内存浪费，也兼顾synchonized锁的性能问题
 * 完美的屏蔽缺点
 */
public class LazyInnerClassSingleton {
    //默认使用LazyInnerClassSingleton的时候，会先加载内部类
    //如果没使用的话，内部类不会加载
    //私有化构造方法
    private  LazyInnerClassSingleton(){
        if(LazyHolder.lazyInnerClassSingleton!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //设置全局访问点，严格控制访问点
    public static LazyInnerClassSingleton getInstance(){
        //在返回以前一定会先加载内部类
        return  LazyHolder.lazyInnerClassSingleton;
    }
    //默认不加载
    private static  class LazyHolder{
        private static final LazyInnerClassSingleton lazyInnerClassSingleton =new LazyInnerClassSingleton();
    }
}
