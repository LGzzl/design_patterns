package com.zzl.creation.abstractFactory.learn;

/**
 * 视频学习
 * @author zzl
 * @since 2021/8/2 23:27
 */
public interface LearnVideo {

    /**
     * 视频信息
     */
    void info();

    /**
     * 视频价格
     * @return 价格
     */
    float price();

    /**
     * 视频作者
     * @return 作者
     */
    String author();
}
