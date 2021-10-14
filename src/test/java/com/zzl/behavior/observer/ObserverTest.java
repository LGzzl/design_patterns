package com.zzl.behavior.observer;

/**
 * @author zzl
 * @since 2021/10/14
 */
public class ObserverTest {

    public static void main(String[] args) {
        DataSubject subject = new DataSubject();
        new LineChartObserver(subject);
        new PieChartObserver(subject);
        new HistogramObserver(subject);
        System.out.println("第一次查询");
        subject.setData("a:10;b:20;c:30;");
        System.out.println("第二次查询");
        subject.setData("a:20;b:30;c:40;");
        System.out.println("第三次查询");
        subject.setData("a:50;b:60;c:70;");
    }
}
