package com.zzl.behavior.visitor;

/**
 * 表示支出账单的元素
 * @author zzl
 * @since 2021/9/24 19:01
 */
public class ExpendElement implements Element {

    public ExpendElement(Integer money, String date, String info) {
        this.money = money;
        this.date = date;
        this.info = info;
    }

    private Integer money;
    private String date;
    private String info;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitExpendElement(this);
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
