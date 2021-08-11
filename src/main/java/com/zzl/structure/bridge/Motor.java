package com.zzl.structure.bridge;

/**
 * 电机抽象接口
 * @author zzl
 */
public abstract class Motor {

    protected Shell shell;

    public Motor(Shell shell) {
        this.shell = shell;
    }

    protected Integer power;

    /**
     * 启动电机
     */
    abstract void startUp();
}
