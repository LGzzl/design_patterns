package com.zzl.objectCreation.singleton;

/**
 * 饿汉单例对象
 * @author zzl
 * @since 2021/8/8 20:20
 */
public class SingletonObj {

    private static final SingletonObj singletonObj = new SingletonObj();

    /**
     * 使构造私有化,防止被外部创建
     */
    private SingletonObj() {
    }

    public static SingletonObj instance(){
        return singletonObj;
    }

    public void info(){
        System.out.println("这是一个饿汉单例对象");
    }
}
