# gupao-work-singleton-2019-3-10

单例模式总结

1.饿汉式:

优点： 类加载的时候就初始化，执行效率高，没有锁机制。

缺点： 不管用不用都在占用内存空间。如果有多个线程，太耗内存

2.懒汉式：

在方法上加锁，如果有多个线程同时访问，cpu分配压力加大，会导致多个线程处于阻塞状态，性能下降，这时候应该考虑双重检查锁
       
破坏单例的方法有两种：
1.可以利用反射拿到私有构造器，强制访问，然后暴力新建实例。
2.利用序列化和反序列化破坏单例

避免反射破坏单例，可以在私有构造器上用判断的方式，如果已经实例已经存在，返回异常

        
