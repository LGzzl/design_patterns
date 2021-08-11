package com.zzl.creation.factoryMethod;

/**
 * 纸张产品
 * @author zzl
 * @since 2021/8/8 17:53
 */
public class PaperProduct implements WoodProduct {

    @Override
    public void info() {
        System.out.println("PaperProduct: 纸张可以书写");
    }
}
