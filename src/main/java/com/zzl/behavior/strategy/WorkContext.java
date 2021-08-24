package com.zzl.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 上班 上下文
 * @author zzl
 * @since 2021/8/24 23:30
 */
public class WorkContext {

    private final Map<String, Strategy> map = new HashMap<>(6);

    public WorkContext() {
        this.map.put("堵车",new SubwayStrategy());
        this.map.put("下雨",new DriveCarStrategy());
        this.map.put("风和日丽",new WalkStrategy());
    }

    public void execute(String condition){
        Strategy strategy = this.map.get(condition);
        strategy.goToWork();
    }
}
