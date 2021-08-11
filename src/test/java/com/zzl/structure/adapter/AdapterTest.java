package com.zzl.structure.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        //测试类适配器
        Adapter adapter = new Adapter();
        adapter.request();
        //测试对象适配器
        Adapter1 adapter1 = new Adapter1(new Adaptee());
        adapter1.request();
    }
}
