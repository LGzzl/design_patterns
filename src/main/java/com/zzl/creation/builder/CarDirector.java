package com.zzl.creation.builder;

import com.zzl.creation.builder.product.CarProduct;

/**
 * 导向器
 * @author zzl
 */
public class CarDirector {

    private final CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public CarProduct getCar(){
        if (carBuilder != null){
            return carBuilder.builder();
        }
        return null;
    }
}
