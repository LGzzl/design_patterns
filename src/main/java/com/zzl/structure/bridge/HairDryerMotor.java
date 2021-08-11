package com.zzl.structure.bridge;

/**
 * 吹风机电机
 * @author zzl
 */
public class HairDryerMotor extends Motor {

    public HairDryerMotor(Shell shell) {
        super(shell);
        this.power = 555;
    }

    @Override
    void startUp() {
        String info = shell.info();
        System.out.println(info + "包裹着功率为" + this.power + "的吹风机电机启动了");
    }
}
