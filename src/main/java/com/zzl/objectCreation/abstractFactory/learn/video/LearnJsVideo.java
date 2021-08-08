package com.zzl.objectCreation.abstractFactory.learn.video;

import com.zzl.objectCreation.abstractFactory.learn.LearnVideo;

/**
 * js视频学习
 * @author zzl
 * @since 2021/8/2 23:54
 */
public class LearnJsVideo implements LearnVideo {
    /**
     * 视频信息
     */
    @Override
    public void info() {
        System.out.println("this is js video.........");
    }

    /**
     * 视频价格
     *
     * @return 价格
     */
    @Override
    public float price() {
        return 666.2f;
    }

    /**
     * 视频作者
     *
     * @return 作者
     */
    @Override
    public String author() {
        return "js author";
    }
}
