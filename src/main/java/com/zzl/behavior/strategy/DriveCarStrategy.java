package com.zzl.behavior.strategy;

/**
 * 开车上班策略
 * @author zzl
 * @since 2021/8/24 23:29
 */
public class DriveCarStrategy implements Strategy {

    @Override
    public void goToWork() {
        System.out.println("今天下雨,开车上班");
    }
}
