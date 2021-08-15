package com.zzl.structure.proxy;

/**
 * cglib动态代理
 * <p>可以不实现接口</p>
 * @author zzl
 * @since 2021/8/15 18:39
 */
public class ComputerProduct {

    public void sellComputer(double price){
        System.out.println("卖出了一台电脑,利润:" + price);
    }
}
