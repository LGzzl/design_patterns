package com.zzl.behavior.templateMethod;

/**
 * 学生b
 * @author zzl
 * @since 2021/8/25 21:00
 */
public class StudentB extends Student {

    @Override
    protected void toSchool() {
        System.out.println("学生b乘坐了3小时飞机到达了aaa大学");
    }

    @Override
    protected void showAdmissionLetter() {
        System.out.println("学生b发现他忘记带aaa大学的通知书");
    }

    @Override
    protected void dormitoryCheckIn() {
        System.out.println("学生b因为通知书没有办完相关手续,并不能入住学生宿舍");
    }

    @Override
    protected void classesBegin() {
        System.out.println("学生b只能回家取通知书,并没有能按时上课");
    }
}
