package com.zzl.objectCreation.factoryMethod;

/**
 * 抽象木材工厂
 * @author zzl
 * @since 2021/8/8 17:47
 */
public interface WoodFactory {

    /**
     * 加工方法
     * @return 木材产品
     */
    WoodProduct machining();
}
