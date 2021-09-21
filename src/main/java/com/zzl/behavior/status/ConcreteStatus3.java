package com.zzl.behavior.status;

import java.util.Random;

/**
 * 具体状态1
 * @author zzl
 * @since 2021/9/21 9:05
 */
public class ConcreteStatus3 implements Status {

    @Override
    public void handler(Context context) {
        System.out.println("context对象当前状态为: 3,它完成了我们需要的操作");
    }
}
