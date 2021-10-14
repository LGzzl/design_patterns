package com.zzl.behavior.observer;

/**
 * 柱状图观察者
 * @author zzl
 * @since 2021/10/14
 */
public class HistogramObserver extends Observer {

    public HistogramObserver(Subject subject) {
        subject.attach(this);
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("柱状图收到数据更新,当前数据为:" + this.subject.getData());
    }
}
