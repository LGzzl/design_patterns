package com.zzl.behavior.observer;

/**
 * 折线图观察者
 * @author zzl
 * @since 2021/10/14
 */
public class LineChartObserver extends Observer {

    public LineChartObserver(Subject subject) {
        subject.attach(this);
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("折线图收到数据更新,当前数据为:" + this.subject.getData());
    }
}
