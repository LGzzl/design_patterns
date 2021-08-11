package com.zzl.creation.factoryMethod;

/**
 * 家具产品
 * @author zzl
 * @since 2021/8/8 17:54
 */
public class FurnishingProduct implements WoodProduct {

    @Override
    public void info() {
        System.out.println("FurnishingProduct: 家具可以满足生活所需");
    }
}
