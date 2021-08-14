package com.zzl.structure.decorator;

/**
 * 硬盘修饰器
 * @author zzl
 * @since 2021/8/14 14:42
 */
public class HardDiskDecorator extends Decorator {

    public HardDiskDecorator(Component component) {
        super(component);
    }

    @Override
    public String info() {
        return this.component.info() + "+500G固态硬盘";
    }

    @Override
    public int price() {
        return 500 + this.component.price();
    }
}
