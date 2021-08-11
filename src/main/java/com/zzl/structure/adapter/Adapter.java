package com.zzl.structure.adapter;

/**
 * 类适配器
 * @author zzl
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        System.out.println("类适配器执行方法");
        specificRequest();
    }
}
