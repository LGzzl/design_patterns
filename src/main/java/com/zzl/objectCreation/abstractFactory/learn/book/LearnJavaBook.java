package com.zzl.objectCreation.abstractFactory.learn.book;

import com.zzl.objectCreation.abstractFactory.learn.LearnBook;

/**
 * java书学习
 * @author zzl
 * @since 2021/8/2 23:45
 */
public class LearnJavaBook implements LearnBook {
    /**
     * 书本信息
     */
    @Override
    public void info() {
        System.out.println("这是一本java书.......");
    }

    /**
     * 书本价格
     *
     * @return 价格
     */
    @Override
    public float price() {
        return 99.6f;
    }

    /**
     * 书本作者
     *
     * @return 作者
     */
    @Override
    public String author() {
        return "java author";
    }
}
