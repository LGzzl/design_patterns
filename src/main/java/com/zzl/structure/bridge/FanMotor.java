package com.zzl.structure.bridge;

/**
 * 风扇电机
 * @author zzl
 */
public class FanMotor extends Motor {

    public FanMotor(Shell shell) {
        super(shell);
        this.power = 666;
    }

    @Override
    void startUp() {
        String info = shell.info();
        System.out.println(info + "包裹着功率为" + this.power + "的风扇电机启动了");
    }
}
