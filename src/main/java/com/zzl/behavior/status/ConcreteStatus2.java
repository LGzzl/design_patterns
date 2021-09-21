package com.zzl.behavior.status;

import java.util.Random;

/**
 * 具体状态2
 * @author zzl
 * @since 2021/9/21 9:05
 */
public class ConcreteStatus2 implements Status {

    @Override
    public void handler(Context context) {
        System.out.println("context对象当前状态为: 2,它可以完成我们需要的操作");
        System.out.println("某些需要的操作");
        System.out.println("某些需要的操作");
        System.out.println("某些需要的操作");
        //模拟一个条件或者某种操作之后切换到下一个对象
        Random random = new Random();
        while (true){
            int i = random.nextInt(100);
            if (i % 2 == 0){
                System.out.println(i + "-可以整除2,切换状态成功");
                context.setStatus(new ConcreteStatus3());
                context.request();
                break;
            }else {
                System.out.println(i + "-不能整除2,切换状态失败,尚不满足切换条件");
            }
        }
    }
}
