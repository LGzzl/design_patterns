package com.zzl.behavior.strategy;

/**
 * 地铁上班策略
 * @author zzl
 * @since 2021/8/24 23:28
 */
public class SubwayStrategy implements Strategy {

    @Override
    public void goToWork() {
        System.out.println("今天大堵车,地铁上班");
    }
}
