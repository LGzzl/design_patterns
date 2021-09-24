package com.zzl.behavior.visitor;

/**
 * 元素接口
 * @author zzl
 * @since 2021/9/24 18:56
 */
public interface Element {

    /**
     * 为访问者提供接口
     * @param visitor 访问者
     */
    void accept(Visitor visitor);
}
