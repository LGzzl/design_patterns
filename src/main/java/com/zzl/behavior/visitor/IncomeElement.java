package com.zzl.behavior.visitor;

/**
 * 表示收入账单元素
 * @author zzl
 * @since 2021/9/24 19:04
 */
public class IncomeElement implements Element {

    public IncomeElement(Integer money, String date, String info) {
        this.money = money;
        this.date = date;
        this.info = info;
    }

    private Integer money;
    private String date;
    private String info;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitIncomeElement(this);
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
