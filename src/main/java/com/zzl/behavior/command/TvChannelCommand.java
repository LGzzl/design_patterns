package com.zzl.behavior.command;

/**
 * 换频道命令
 * @author zzl
 * @since 2021/8/22 18:39
 */
public class TvChannelCommand extends Command {

    private final String channel;

    public TvChannelCommand(Tv tv,String channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    void execute() {
        this.tv.changeChannel(channel);
    }
}
