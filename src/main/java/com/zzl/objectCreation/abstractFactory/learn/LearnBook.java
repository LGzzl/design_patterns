package com.zzl.objectCreation.abstractFactory.learn;

/**
 * 书本学习
 * @author zzl
 * @since 2021/8/2 23:26
 */
public interface LearnBook {

    /**
     * 书本信息
     */
    void info();

    /**
     * 书本价格
     * @return 价格
     */
    float price();

    /**
     * 书本作者
     * @return 作者
     */
    String author();
}
