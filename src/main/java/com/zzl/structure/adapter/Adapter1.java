package com.zzl.structure.adapter;

/**
 * 对象适配器
 * @author zzl
 */
public class Adapter1 implements Target {

    private Adaptee adaptee;

    public Adaptee getAdaptee() {
        return adaptee;
    }

    public Adapter1(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("对象适配器执行方法");
        this.adaptee.specificRequest();
    }
}
