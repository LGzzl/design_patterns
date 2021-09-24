package com.zzl.behavior.visitor;

/**
 * 表示boss访问者
 * 对boos来说,可能并不关心每个账单的细节,更注重的是总收入总支出
 * @author zzl
 * @since 2021/9/24 19:16
 */
public class BossVisitor implements Visitor {

    private Integer totalExpend = 0;
    private Integer totalIncome = 0;

    @Override
    public void visitExpendElement(ExpendElement expendElement) {
        totalExpend += expendElement.getMoney();
    }

    @Override
    public void visitIncomeElement(IncomeElement incomeElement) {
        totalIncome += incomeElement.getMoney();
    }

    public void showTotalMoney(){
        System.out.println("公司总收入为:" + totalIncome);
        System.out.println("公司总支出为:" + totalExpend);
    }
}
