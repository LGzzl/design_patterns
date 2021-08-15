package com.zzl.structure.flyweight;

/**
 * 文学类书本
 * @author zzl
 * @since 2021/8/15 11:52
 */
public class LiteratureBook implements Book {

    private String name;
    private String useName;

    public LiteratureBook(String name) {
        this.name = name;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    @Override
    public void read() {
        System.out.println(this.useName + "开始阅读" + name + "并收获颇丰");
    }
}
