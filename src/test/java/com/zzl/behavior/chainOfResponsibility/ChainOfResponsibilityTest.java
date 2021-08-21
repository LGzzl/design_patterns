package com.zzl.behavior.chainOfResponsibility;

import java.util.Date;

public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        FilterHandler filterHandler = loadFilterHandler();
        filterHandler.filter("String","string");
        filterHandler.filter("Integer",998);
        filterHandler.filter("Date",new Date());
        filterHandler.filter("Long",99999999888L);
    }

    private static FilterHandler loadFilterHandler(){
        StringFilterHandler stringFilterHandler = new StringFilterHandler();
        IntegerFilterHandler integerFilterHandler = new IntegerFilterHandler();
        DateFilterHandler dateFilterHandler = new DateFilterHandler();

        //设置责任链
        stringFilterHandler.setNextNode(integerFilterHandler);
        integerFilterHandler.setNextNode(dateFilterHandler);

        return stringFilterHandler;
    }
}
