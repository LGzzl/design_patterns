package com.zzl.creation.prototype;

import java.util.Date;

/**
 * 用户配置类
 * @author zzl
 * @since 2021/8/8 20:08
 */
public class UserSystemConfig {

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    protected SystemConfig clone() throws CloneNotSupportedException {
        SystemConfig systemConfig = (SystemConfig) super.clone();
        this.date = (Date) this.date.clone();
        return systemConfig;
    }
}
