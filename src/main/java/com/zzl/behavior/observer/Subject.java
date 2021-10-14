package com.zzl.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标类
 * @author zzl
 * @since 2021/10/14
 */
public abstract class Subject {

    private final List<Observer> observers = new ArrayList<>(12);

    /**
     * 订阅目标方法
     * @param observer 一个具体观察者
     */
    public void attach(Observer observer){
        this.observers.add(observer);
    }

    /**
     * 取消订阅目标方法
     * @param observer 一个具体观察者
     */
    public void detach(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    /**
     * 获取目标的数据
     * @return 数据
     */
    public abstract String getData();
}
