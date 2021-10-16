package com.zzl.behavior.iterator;

/**
 * 迭代器接口
 * @author zzl
 * @since 2021/10/16
 */
public interface Iterator {

    /**
     * 返回一个聚合对象中的元素
     * @return t
     */
    Object next();

    /**
     * 判断是否还有元素
     * @return 是否还有元素
     */
    boolean hasNext();
}
