package hungrysingleton;

/**
 * Created by mzcsh on 2019/3/10
 * 饿汉
 */
public class HungrySingleton {
    //类加载的时候初始化
    private static  final HungrySingleton hungrySingleton =new HungrySingleton();

    //私有构造方法
    private  HungrySingleton(){};

    //设置全局访问点，严格控制访问
    public static  HungrySingleton getInstance(){
     return  hungrySingleton;
    }
}
//饿汉单列
/**
 * 优点 ： 没有任何锁，执行效率比较高。
 * 缺点： 类加载的时候就初始化，不管用不用都占着空间，比较浪费资源
 */
