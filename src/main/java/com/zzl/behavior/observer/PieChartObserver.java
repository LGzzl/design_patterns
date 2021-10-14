package com.zzl.behavior.observer;

/**
 * @author zzl
 * @since 2021/10/14
 */
public class PieChartObserver extends Observer {

    public PieChartObserver(Subject subject) {
        subject.attach(this);
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("饼图收到数据更新,当前数据为:" + this.subject.getData());
    }
}
