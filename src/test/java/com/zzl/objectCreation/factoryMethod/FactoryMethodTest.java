package com.zzl.objectCreation.factoryMethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        WoodFactory paperFactory = new PaperFactory();
        WoodProduct product = paperFactory.machining();
        product.info();//PaperProduct: 纸张可以书写
        //使用带参数具体工厂时
        ConcreteWoodFactory woodFactory = new ConcreteWoodFactory();
        WoodProduct furnishing = woodFactory.machining("furnishing");
        furnishing.info();//FurnishingProduct: 家具可以满足生活所需
    }
}
