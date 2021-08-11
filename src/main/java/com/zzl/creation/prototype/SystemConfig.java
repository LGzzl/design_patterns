package com.zzl.creation.prototype;

/**
 * 系统配置类
 * @author zzl
 * @since 2021/8/8 20:02
 */
public abstract class SystemConfig implements Cloneable {

    private String name;

    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
