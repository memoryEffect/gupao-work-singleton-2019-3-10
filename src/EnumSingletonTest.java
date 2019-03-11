import lazysingleton.EnumSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by mzcsh on 2019/3/11.
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance1 =  null;

        EnumSingleton instance2 = EnumSingleton.getInstance();
        instance2.setDate(new Object());

        try {
            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(instance1.getDate());
            System.out.println(instance2.getDate());
            System.out.println(instance1.getDate()==instance2.getDate());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        Class clazz=EnumSingleton.class;
//        try {
//            Constructor  a=clazz.getDeclaredConstructor(String.class,int.class);
//            a.setAccessible(true);
//            EnumSingleton enumSingleton = (EnumSingleton) a.newInstance("tom",666);
//
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
    }
}
