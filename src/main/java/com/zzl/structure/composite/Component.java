package com.zzl.structure.composite;

import java.util.List;

/**
 * 菜单接口
 * <p>此例子为透明组合模式</p>
 * @author zzl
 */
public interface Component {

    /**
     * 添加子组件
     * @param component 添加的组件
     */
    void add(Component component);

    /**
     * 删除子组件
     * @param component 删除子组件
     */
    void remove(Component component);

    /**
     * 索引获得某个子组件
     * @param i 索引
     * @return 组件
     */
    Component get(int i);

    /**
     * 获得组件列表
     * @return 所有组件
     */
    List<Component> get();

    /**
     * 展示
     * @param index 初始层级,方便演示
     */
    void display(int index);
}
