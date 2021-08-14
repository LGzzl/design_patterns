package com.zzl.structure.facade;

/**
 * 电脑产品
 * @author zzl
 * @since 2021/8/14 22:46
 */
public class ComputerProduct implements Product {

    @Override
    public void info() {
        System.out.println("购买一台电脑,花费998元");
    }
}
