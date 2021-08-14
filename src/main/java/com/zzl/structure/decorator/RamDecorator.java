package com.zzl.structure.decorator;

/**
 * 加内存装饰器
 * @author zzl
 * @since 2021/8/14 14:37
 */
public class RamDecorator extends Decorator {

    public RamDecorator(Component component) {
        super(component);
    }

    @Override
    public String info() {
        return this.component.info() + "+8G某品牌内存";
    }

    @Override
    public int price() {
        return 200 + this.component.price();
    }
}
