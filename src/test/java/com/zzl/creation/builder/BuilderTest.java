package com.zzl.creation.builder;

import com.zzl.creation.builder.builder.FirstCarBuilder;
import com.zzl.creation.builder.builder.SecondCarBuilder;
import com.zzl.creation.builder.product.CarProduct;

public class BuilderTest {

    public static void main(String[] args) {
        CarBuilder builder = new FirstCarBuilder();
        builder.builderBrake("某制动器").builderFrame("红色纸车架").builderSteeringWheel("拖拉机方向盘");
        CarDirector director = new CarDirector(builder);
        CarProduct car = director.getCar();
        System.out.println(car);//CarProduct{engine='v8发动机', tire='圆形轮胎', frame='红色纸车架', steeringWheel='拖拉机方向盘', brake='某制动器', speed=300}
        CarBuilder builder1 = new SecondCarBuilder();
        builder1.builderFrame("蓝色车架").builderSteeringWheel("拖拉机方向盘");
        CarDirector director1 = new CarDirector(builder1);
        CarProduct car1 = director1.getCar();
        System.out.println(car1);//CarProduct{engine='null', tire='null', frame='蓝色车架', steeringWheel='拖拉机方向盘', brake='null', speed=0}
    }
}
