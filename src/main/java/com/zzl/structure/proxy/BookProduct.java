package com.zzl.structure.proxy;

/**
 * 具体产品实现
 * @author zzl
 * @since 2021/8/15 18:18
 */
public class BookProduct implements Product {

    @Override
    public void sellProduct(double price) {
        System.out.println("卖出了一本书,赚到了:" + price);
    }
}
