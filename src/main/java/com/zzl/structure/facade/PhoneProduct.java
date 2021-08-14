package com.zzl.structure.facade;

/**
 * 手机产品
 * @author zzl
 * @since 2021/8/14 22:47
 */
public class PhoneProduct implements Product {

    @Override
    public void info() {
        System.out.println("购买了手机产品,花费999");
    }
}
