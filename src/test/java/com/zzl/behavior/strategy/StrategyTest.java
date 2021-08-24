package com.zzl.behavior.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        WorkContext context = new WorkContext();
        context.execute("堵车");
        context.execute("下雨");
        context.execute("风和日丽");
    }
}
