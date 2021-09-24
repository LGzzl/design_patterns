package com.zzl.behavior.visitor;

/**
 * 会计访问者
 * 对于会计来说,每一笔账单都需要记录
 * @author zzl
 * @since 2021/9/24 19:26
 */
public class AccountingVisitor implements Visitor {

    @Override
    public void visitExpendElement(ExpendElement expendElement) {
        System.out.println("支出账单: 金额=" + expendElement.getMoney() + ",日期=" + expendElement.getDate() + ",用于=" + expendElement.getInfo());
    }

    @Override
    public void visitIncomeElement(IncomeElement incomeElement) {
        System.out.println("收入账单: 金额=" + incomeElement.getMoney() + ",日期=" + incomeElement.getDate() + ",收入来源=" + incomeElement.getInfo());
    }
}
