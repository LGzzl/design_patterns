package com.zzl.creation.factoryMethod;

/**
 * 家具工厂
 * @author zzl
 * @since 2021/8/8 17:56
 */
public class FurnishingFactory implements WoodFactory {

    @Override
    public WoodProduct machining() {
        return new FurnishingProduct();
    }
}
