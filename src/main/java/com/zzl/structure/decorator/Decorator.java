package com.zzl.structure.decorator;

/**
 * 装饰器抽象类
 * @author zzl
 * @since 2021/8/14 14:30
 */
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
