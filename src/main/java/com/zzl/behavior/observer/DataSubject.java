package com.zzl.behavior.observer;

/**
 * 数据目标类
 * @author zzl
 * @since 2021/10/14
 */
public class DataSubject extends Subject {

    private String data;

    public void setData(String data) {
        this.data = data;
        notifyAllObservers();
    }

    @Override
    public String getData() {
        return this.data;
    }
}
