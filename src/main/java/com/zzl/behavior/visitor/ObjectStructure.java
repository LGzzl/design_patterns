package com.zzl.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 * @author zzl
 * @since 2021/9/24 20:12
 */
public class ObjectStructure {

    public ObjectStructure() {
        bills.add(new ExpendElement(998,"2021-09-01","买电脑"));
        bills.add(new IncomeElement(668,"2021-09-03","卖电脑"));
        bills.add(new ExpendElement(6666,"2021-09-05","买了几台电脑"));
        bills.add(new ExpendElement(8888,"2021-09-06","买了一台小电车"));
        bills.add(new IncomeElement(5555,"2021-09-07","完成一笔销售订单"));
        bills.add(new ExpendElement(7777,"2021-09-08","交房租"));
    }

    private final List<Element> bills = new ArrayList<>();

    public void showBills(Visitor visitor){
        for (Element bill : bills) {
            bill.accept(visitor);
        }
    }
}
