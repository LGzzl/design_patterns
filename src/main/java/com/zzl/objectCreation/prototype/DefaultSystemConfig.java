package com.zzl.objectCreation.prototype;

import java.util.Date;

/**
 * 默认配置
 * @author zzl
 * @since 2021/8/8 20:07
 */
public class DefaultSystemConfig extends SystemConfig {

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    protected SystemConfig clone() throws CloneNotSupportedException {
        return (SystemConfig) super.clone();
    }
}
