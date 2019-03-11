package lazysingleton;

/**
 * Created by mzcsh on 2019/3/11.
 */
public class TheadLocalSingleton {

    private static  final ThreadLocal<TheadLocalSingleton> theadTheadSingleton=
            new ThreadLocal<TheadLocalSingleton>(){
            @Override
            protected TheadLocalSingleton initialValue(){
                return new TheadLocalSingleton();
            }

    };

    //私有化构造方法
    private TheadLocalSingleton(){}
    public static TheadLocalSingleton getInstance(){
        return theadTheadSingleton.get();
    }
}
