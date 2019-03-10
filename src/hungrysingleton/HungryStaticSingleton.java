package hungrysingleton;

/**
 * Created by mzcsh on 2019/3/10.
 * 静态方法块饿汉式
 */
public class HungryStaticSingleton {
    //类加载的时候就初始化
    private static  final HungryStaticSingleton hungryStaticSingleton ;
    //静态方法块和静态方法一样
    static {
        hungryStaticSingleton=new HungryStaticSingleton();
    }

    //私有构造方法
    private HungryStaticSingleton(){}

    //设置全局访问点，严格控制访问
    public static  HungryStaticSingleton getInstance(){
        return  hungryStaticSingleton;
    }
}
