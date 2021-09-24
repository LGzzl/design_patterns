package com.zzl.behavior.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        //创建两个访问者
        BossVisitor bossVisitor = new BossVisitor();
        AccountingVisitor accountingVisitor = new AccountingVisitor();
        //一个对象结构
        ObjectStructure objectStructure = new ObjectStructure();
        //访问者处理对象
        System.out.println("========================会计要记录每个账单=======================");
        objectStructure.showBills(accountingVisitor);
        objectStructure.showBills(bossVisitor);
        //boss访问者只关心他所关心的
        System.out.println("========================boss只关心总收入总支出=======================");
        bossVisitor.showTotalMoney();
    }
}
