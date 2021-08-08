package com.zzl.objectCreation.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        SingletonObj instance = SingletonObj.instance();
        instance.info();//这是一个饿汉单例对象
        SingletonObj1 singletonObj1 = SingletonObj1.instance();
        singletonObj1.info();//这是一个线程安全的懒汉单例对象
    }
}
