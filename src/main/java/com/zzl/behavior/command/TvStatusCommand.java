package com.zzl.behavior.command;

/**
 * 更改电视状态命令
 * @author zzl
 * @since 2021/8/22 18:38
 */
public class TvStatusCommand extends Command {

    public TvStatusCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    void execute() {
        this.tv.changeStatus();
    }
}
