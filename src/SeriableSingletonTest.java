import lazysingleton.SeriableSingleton;

import java.io.*;

/**
 * Created by mzcsh on 2019/3/10.
 */
public class SeriableSingletonTest  {
    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 =SeriableSingleton.getInstance();

        FileOutputStream fos =null;

        try {
            fos=new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream  oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();


            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1= (SeriableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
