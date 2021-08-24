package com.zzl.behavior.strategy;

/**
 * 步行策略
 * @author zzl
 * @since 2021/8/24 23:27
 */
public class WalkStrategy implements Strategy {

    @Override
    public void goToWork() {
        System.out.println("今天风和日历,步行上班");
    }
}
