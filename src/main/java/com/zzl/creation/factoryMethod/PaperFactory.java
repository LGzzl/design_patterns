package com.zzl.creation.factoryMethod;

/**
 * 纸张工厂
 * @author zzl
 * @since 2021/8/8 17:52
 */
public class PaperFactory implements WoodFactory {

    @Override
    public WoodProduct machining() {
        return new PaperProduct();
    }
}
