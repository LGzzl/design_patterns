package com.zzl.behavior.command;

/**
 * 命令接口
 * @author zzl
 * @since 2021/8/22 18:15
 */
public abstract class Command {

    protected Tv tv;

    public Tv getTv() {
        return tv;
    }

    /**
     * 命令所需要执行的方法
     */
    abstract void execute();
}
