package com.zzl.behavior.chainOfResponsibility;

/**
 * string类型参数处理
 * @author zzl
 * @since 2021/8/21 17:11
 */
public class StringFilterHandler extends FilterHandler {

    public StringFilterHandler() {
        this.paramType = "String";
    }

    @Override
    void checkParam(Object param) {
        System.out.println("StringFilterHandler 类对参数做了操作 :" + param.toString());
    }
}
