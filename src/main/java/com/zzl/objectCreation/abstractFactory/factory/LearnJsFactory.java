package com.zzl.objectCreation.abstractFactory.factory;

import com.zzl.objectCreation.abstractFactory.LearnAbstractFactory;
import com.zzl.objectCreation.abstractFactory.learn.LearnBook;
import com.zzl.objectCreation.abstractFactory.learn.book.LearnJsBook;
import com.zzl.objectCreation.abstractFactory.learn.video.LearnJsVideo;
import com.zzl.objectCreation.abstractFactory.learn.LearnVideo;

/**
 * js学习
 * @author zzl
 * @since 2021/8/2 23:23
 */
public class LearnJsFactory extends LearnAbstractFactory {

    /**
     * 获取视频学习
     *
     * @return 视频学习
     */
    @Override
    public LearnVideo getVideoCourse() {
        return new LearnJsVideo();
    }

    /**
     * 获取书本学习
     *
     * @return 书本学习
     */
    @Override
    public LearnBook getBookCourse() {
        return new LearnJsBook();
    }
}
