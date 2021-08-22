package com.zzl.behavior.command;

/**
 * 电视
 * @author zzl
 * @since 2021/8/22 17:33
 */
public class Tv {

    /**
     * 电视频道
     */
    private String channel = "CCTV-1";

    /**
     * 当前电视状态
     */
    private String status;

    private void info(){
        System.out.println("电视机当前的状态:" + status + ",播放的频道为:" + channel);
    }

    /**
     * 更改电视机状态方法
     */
    public void changeStatus(){
        this.status = "开启".equals(this.status) ? "关闭" : "开启";
        this.info();
    }

    /**
     * 更换频道方法
     * @param channel 频道
     */
    public void changeChannel(String channel){
        this.channel = channel;
        info();
    }
}
