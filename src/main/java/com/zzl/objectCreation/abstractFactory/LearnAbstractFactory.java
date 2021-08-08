package com.zzl.objectCreation.abstractFactory;

import com.zzl.objectCreation.abstractFactory.learn.LearnBook;
import com.zzl.objectCreation.abstractFactory.learn.LearnVideo;

/**
 * 学习平台抽象工厂
 * @author zzl
 * @since 2021/8/2 23:18
 */
public abstract class LearnAbstractFactory {

    /**
     * 获取视频学习
     * @return 视频学习
     */
    public abstract LearnVideo getVideoCourse();

    /**
     * 获取书本学习
     * @return 书本学习
     */
    public abstract LearnBook getBookCourse();
}
