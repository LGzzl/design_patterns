package com.zzl.creation.singleton;

/**
 * 线程安全的懒汉单例
 * @author zzl
 * @since 2021/8/8 21:28
 */
public class SingletonObj1 {

    private SingletonObj1(){}

    private static SingletonObj1 singletonObj1 = null;

    public static synchronized SingletonObj1 instance(){
        if (singletonObj1 == null){
            singletonObj1 = new SingletonObj1();
        }
        return singletonObj1;
    }

    public void info(){
        System.out.println("这是一个线程安全的懒汉单例对象");
    }
}
