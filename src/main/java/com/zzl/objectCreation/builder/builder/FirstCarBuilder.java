package com.zzl.objectCreation.builder.builder;

import com.zzl.objectCreation.builder.CarBuilder;
import com.zzl.objectCreation.builder.product.CarProduct;

/**
 * 第一台车建造者
 * @author zzl
 * @since 2021/8/3 23:17
 */
public class FirstCarBuilder extends CarBuilder {

    private final CarProduct car = new CarProduct();

    public FirstCarBuilder() {
        builderEngine();
        builderTire();
    }

    @Override
    public void builderEngine() {
        car.setEngine("v8发动机");
        builderSpeed(300);
    }

    @Override
    public void builderTire() {
        car.setTire("圆形轮胎");
    }

    @Override
    public CarBuilder builderFrame(String frame) {
        car.setFrame(frame);
        return this;
    }

    @Override
    public CarBuilder builderSteeringWheel(String steeringWheel) {
        car.setSteeringWheel(steeringWheel);
        return this;
    }

    @Override
    public CarBuilder builderBrake(String brake) {
        car.setBrake(brake);
        return this;
    }

    @Override
    public CarBuilder builderSpeed(int speed) {
        car.setSpeed(speed);
        return this;
    }

    @Override
    public CarProduct builder() {
        return this.car;
    }
}
