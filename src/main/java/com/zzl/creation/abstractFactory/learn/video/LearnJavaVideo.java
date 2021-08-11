package com.zzl.creation.abstractFactory.learn.video;

import com.zzl.creation.abstractFactory.learn.LearnVideo;

/**
 * java视频学习
 * @author zzl
 * @since 2021/8/2 23:54
 */
public class LearnJavaVideo implements LearnVideo {
    /**
     * 视频信息
     */
    @Override
    public void info() {
        System.out.println("this is java video.........");
    }

    /**
     * 视频价格
     *
     * @return 价格
     */
    @Override
    public float price() {
        return 998.2f;
    }

    /**
     * 视频作者
     *
     * @return 作者
     */
    @Override
    public String author() {
        return "java author";
    }
}
