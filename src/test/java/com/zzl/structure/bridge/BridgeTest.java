package com.zzl.structure.bridge;

public class BridgeTest {

    public static void main(String[] args) {
        FridgeMotor fridgeMotor = new FridgeMotor(new FridgeShell());
        fridgeMotor.startUp();//两米高的白色冰箱外壳包裹着功率为998的冰箱电机启动了
        FanMotor fanMotor = new FanMotor(new FanShell());
        fanMotor.startUp();//黄色的风扇外壳包裹着功率为666的风扇电机启动了
    }
}
