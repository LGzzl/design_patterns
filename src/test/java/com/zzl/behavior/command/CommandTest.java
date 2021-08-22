package com.zzl.behavior.command;


public class CommandTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Tv tv = new Tv();
        //创建需要执行的命令
        TvStatusCommand command1 = new TvStatusCommand(tv);
        TvChannelCommand command2 = new TvChannelCommand(tv, "CCTV-2");
        TvChannelCommand command3 = new TvChannelCommand(tv, "CCTV-3");
        TvChannelCommand command4 = new TvChannelCommand(tv, "CCTV-4");
        TvChannelCommand command5 = new TvChannelCommand(tv, "CCTV-5");
        TvChannelCommand command6 = new TvChannelCommand(tv, "CCTV-6");
        remoteControl.addCommand(command1);
        remoteControl.addCommand(command2);
        remoteControl.addCommand(command3);
        remoteControl.addCommand(command4);
        remoteControl.addCommand(command5);
        remoteControl.addCommand(command6);
        //开始执行命令
        remoteControl.action();
        System.out.println("------发现前面的频道的节目似乎比较好看,执行撤销命令-----");
        //撤销了两次命令
        remoteControl.reverse(2);
    }
}
