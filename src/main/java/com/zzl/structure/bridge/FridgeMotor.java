package com.zzl.structure.bridge;

/**
 * 冰箱电机
 * @author zzl
 */
public class FridgeMotor extends Motor{

    public FridgeMotor(Shell shell) {
        super(shell);
        this.power = 998;
    }

    @Override
    void startUp() {
        String info = shell.info();
        System.out.println(info + "包裹着功率为" + this.power + "的冰箱电机启动了");
    }
}
