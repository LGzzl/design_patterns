package com.zzl.objectCreation.abstractFactory.learn.book;

import com.zzl.objectCreation.abstractFactory.learn.LearnBook;

/**
 * js书本学习
 * @author zzl
 * @since 2021/8/2 23:46
 */
public class LearnJsBook implements LearnBook {
    /**
     * 书本信息
     */
    @Override
    public void info() {
        System.out.println("这是一本js书.......");
    }

    /**
     * 书本价格
     *
     * @return 价格
     */
    @Override
    public float price() {
        return 100.5f;
    }

    /**
     * 书本作者
     *
     * @return 作者
     */
    @Override
    public String author() {
        return "javascript author";
    }
}
