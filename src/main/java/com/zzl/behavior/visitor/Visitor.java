package com.zzl.behavior.visitor;

/**
 * 访问者基类
 * @author zzl
 * @since 2021/9/24 18:56
 */
public interface Visitor {

    /**
     * 获取支出账单的信息
     * @param expendElement 支出账单
     */
    void visitExpendElement(ExpendElement expendElement);

    /**
     * 获取收入账单的信息
     * @param incomeElement 收入账单
     */
    void visitIncomeElement(IncomeElement incomeElement);
}
