package com.zzl.structure.decorator;

/**
 * 电脑实体
 * @author zzl
 * @since 2021/8/14 14:28
 */
public class Computer implements Component {

    private final String info = "一台普通的电脑";
    private final int price = 998;

    @Override
    public String info() {
        return info;
    }

    @Override
    public int price() {
        return price;
    }
}
