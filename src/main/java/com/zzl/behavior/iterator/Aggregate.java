package com.zzl.behavior.iterator;

/**
 * 聚合容器接口
 * @author zzl
 * @since 2021/10/16
 */
public interface Aggregate {

    /**
     * 返回一个迭代器
     * @return 迭代器
     */
    Iterator iterator();
}
