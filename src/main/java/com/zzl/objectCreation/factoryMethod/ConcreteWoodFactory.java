package com.zzl.objectCreation.factoryMethod;

/**
 * 一个具体的带的参数工厂
 * @author zzl
 * @since 2021/8/8 17:57
 */
public class ConcreteWoodFactory {

    /**
     * 加工方法
     * @return 木材产品
     */
    public WoodProduct machining(String product){
        if ("paper".equals(product)){
            return new PaperProduct();
        }else if ("furnishing".equals(product)){
            return new FurnishingProduct();
        }
        throw new RuntimeException("还没有此类工厂");
    }
}
