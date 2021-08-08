package com.zzl.objectCreation.builder;

import com.zzl.objectCreation.builder.product.CarProduct;

/**
 * 车建造者
 * @author zzl
 * @since 2021/8/3 22:54
 */
public abstract class CarBuilder {

    /**
     * 组装发动机
     */
    protected abstract void builderEngine();

    /**
     * 组装轮胎
     */
    protected abstract void builderTire();

    /**
     * 组装车架
     * @param frame 车架
     * @return 建造者对象
     */
    protected abstract CarBuilder builderFrame(String frame);

    /**
     * 组装方向盘
     * @param steeringWheel 方向盘
     * @return 建造者对象
     */
    protected abstract CarBuilder builderSteeringWheel(String steeringWheel);

    /**
     * 制动器
     * @param brake 制动器
     * @return 建造者对象
     */
    protected abstract CarBuilder builderBrake(String brake);

    /**
     * 速度
     * @param speed 速度
     * @return 建造者对象
     */
    protected abstract CarBuilder builderSpeed(int speed);

    /**
     * 构建产品
     * @return 产品
     */
    protected abstract CarProduct builder();
}
