package com.zzl.structure.proxy;

/**
 * jdk动态代理
 * <p>jdk动态代理是基于接口的</p>
 * <p>jdk动态代理要求被代理接口必须有实现</p>
 * @author zzl
 * @since 2021/8/15 18:12
 */
public interface Product {

    /**
     * 卖出商品
     * @param price 价格
     */
    void sellProduct(double price);
}
