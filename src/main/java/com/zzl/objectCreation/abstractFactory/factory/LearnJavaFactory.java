package com.zzl.objectCreation.abstractFactory.factory;

import com.zzl.objectCreation.abstractFactory.LearnAbstractFactory;
import com.zzl.objectCreation.abstractFactory.learn.LearnBook;
import com.zzl.objectCreation.abstractFactory.learn.book.LearnJavaBook;
import com.zzl.objectCreation.abstractFactory.learn.video.LearnJavaVideo;
import com.zzl.objectCreation.abstractFactory.learn.LearnVideo;

/**
 * java学习工厂
 * @author zzl
 * @since 2021/8/2 23:22
 */
public class LearnJavaFactory extends LearnAbstractFactory {

    /**
     * 获取视频学习
     * @return 视频学习
     */
    @Override
    public LearnVideo getVideoCourse() {
        return new LearnJavaVideo();
    }

    /**
     * 获取书本学习
     * @return 书本学习
     */
    @Override
    public LearnBook getBookCourse() {
        return new LearnJavaBook();
    }
}
