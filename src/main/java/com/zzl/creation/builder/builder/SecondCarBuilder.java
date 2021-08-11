package com.zzl.creation.builder.builder;

import com.zzl.creation.builder.CarBuilder;
import com.zzl.creation.builder.product.CarProduct;

/**
 * 第二台车建造者
 * @author zzl
 * @since 2021/8/3 23:17
 */
public class SecondCarBuilder extends CarBuilder {

    private final CarProduct car = new CarProduct();

    @Override
    public void builderEngine() {
        car.setEngine("不知名发动机");
        builderSpeed(300);
    }

    @Override
    public void builderTire() {
        car.setTire("椭圆形轮胎");
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
