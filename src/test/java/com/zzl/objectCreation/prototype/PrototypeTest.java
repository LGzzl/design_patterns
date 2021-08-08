package com.zzl.objectCreation.prototype;

import java.util.Date;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        DefaultSystemConfig defaultSystemConfig = new DefaultSystemConfig();
        defaultSystemConfig.setName("默认配置");
        defaultSystemConfig.setInfo("系统默认配置");
        defaultSystemConfig.setDate(new Date());
        SystemConfig clone = defaultSystemConfig.clone();
        System.out.println("defaultSystemConfig.name:" + defaultSystemConfig.getName());//defaultSystemConfig.name:默认配置
        System.out.println("clone.name:" + clone.getName());//clone.name:默认配置
    }
}