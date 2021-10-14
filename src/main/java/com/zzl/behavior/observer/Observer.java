package com.zzl.behavior.observer;

/**
 * 抽象观察者
 * @author zzl
 * @since 2021/10/14
 */
public abstract class Observer {

    protected Subject subject;

    /**
     * 接受目标更新通知方法
     */
    public abstract void update();
}
