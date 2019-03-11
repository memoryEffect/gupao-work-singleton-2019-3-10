package lazysingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by mzcsh on 2019/3/11.
 * 容器式单例
 */
public class ContainerSingleton {

    //私有构造方法
    private ContainerSingleton(){};
    private static Map<String,Object> ioc =new ConcurrentHashMap<String,Object>();
    public static Object getBean(String className){
        synchronized (ioc){
            if(ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj=Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return ioc.get(className);
    }
}
