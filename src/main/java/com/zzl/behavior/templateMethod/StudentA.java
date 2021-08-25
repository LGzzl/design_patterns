package com.zzl.behavior.templateMethod;

/**
 * 学生a
 * @author zzl
 * @since 2021/8/25 21:00
 */
public class StudentA extends Student {

    @Override
    protected void toSchool() {
        System.out.println("学生a坐了一天火车感到了xxx大学");
    }

    @Override
    protected void showAdmissionLetter() {
        System.out.println("学生a在包里取出了xxx大学的录取通知书,检查通过");
    }

    @Override
    protected void dormitoryCheckIn() {
        System.out.println("学生a办完手续,顺利的到达学生宿舍");
    }
}
