package com.zzl.behavior.chainOfResponsibility;

/**
 * 整形类过滤器
 * @author zzl
 * @since 2021/8/21 17:15
 */
public class IntegerFilterHandler extends FilterHandler {

    public IntegerFilterHandler() {
        this.paramType = "Integer";
    }

    @Override
    void checkParam(Object param) {
        System.out.println("IntegerFilterHandler 类对参数做了操作 :" + param.toString());
    }
}
