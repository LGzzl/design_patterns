package com.zzl.behavior.status;

/**
 * 具体状态1
 * @author zzl
 * @since 2021/9/21 9:05
 */
public class ConcreteStatus1 implements Status {

    @Override
    public void handler(Context context) {
        System.out.println("context对象当前状态为: 1,它做不了任何事情");
        System.out.println("等待五秒后将切换到下一个状态");
        //模拟一个条件或者某种操作之后切换到下一个对象
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        context.setStatus(new ConcreteStatus2());
        context.request();
    }
}
