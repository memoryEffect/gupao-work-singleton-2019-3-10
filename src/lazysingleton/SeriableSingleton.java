package lazysingleton;

import java.io.Serializable;

/**
 * Created by mzcsh on 2019/3/10.
 */
public class SeriableSingleton implements Serializable{
    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换成一个IO流，写入到其他地方(可以时磁盘、网络IO)
    //内存中状态给永久保留下来

    //反序列化
    //把已经持久化的字节码内容，转换成IO流
    //通过IO流的读取，进而讲读取的内容转为java对象
    //在转换过程中会重新创建对象new

    private final static SeriableSingleton INSTANCE = new SeriableSingleton();

    //私有化构造器
    private SeriableSingleton(){}

    //设置全局访问点，严格控制访问点
    public  static SeriableSingleton getInstance(){
        return INSTANCE;
    }
    private Object readResolve(){
        return  INSTANCE;
    }
}
