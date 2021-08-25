package com.zzl.behavior.templateMethod;

/**
 * 学生抽象类
 * @author zzl
 * @since 2021/8/25 20:52
 */
public abstract class Student {

    /**
     * 模板方法
     */
    public void admission(){
        toSchool();
        showAdmissionLetter();
        dormitoryCheckIn();
        classesBegin();
    }

    /**
     * 去学校抽象方法
     */
    protected abstract void toSchool();

    /**
     * 出示录取通知书
     */
    protected abstract void showAdmissionLetter();

    /**
     * 宿舍入住登记
     */
    protected abstract void dormitoryCheckIn();

    /**
     * 定义可不重写方法
     */
    protected void classesBegin(){
        System.out.println("终于办完了入学手续,开始上课了");
    }
}
