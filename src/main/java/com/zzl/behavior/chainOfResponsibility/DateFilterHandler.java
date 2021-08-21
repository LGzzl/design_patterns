package com.zzl.behavior.chainOfResponsibility;

/**
 * 日期对象参数处理器
 * @author zzl
 * @since 2021/8/21 17:16
 */
public class DateFilterHandler extends FilterHandler {

    public DateFilterHandler() {
        this.paramType = "Date";
    }

    @Override
    void checkParam(Object param) {
        System.out.println("DateFilterHandler 类对参数做了操作 :" + param.toString());
    }
}
