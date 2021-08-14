package com.zzl.structure.decorator;

/**
 * 抽象接口
 * @author zzl
 * @since 2021/8/14 14:25
 */
public interface Component {

    /**
     * 详情
     * @return 详情
     */
    String info();

    /**
     * 获取价格
     * @return 价格
     */
    int price();
}
