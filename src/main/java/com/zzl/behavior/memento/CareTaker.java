package com.zzl.behavior.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录管理者
 * @author zzl
 * @since 2021/10/14
 */
public class CareTaker {

    /**
     * 保存备忘录的数据结构可以是多种
     * 此处使用一个list<br/>
     * 当然,你也可以只保存最后一个状态
     */
    private final List<Memento> mementos = new ArrayList<>(10);

    public void saveMemento(Memento memento){
        this.mementos.add(memento);
    }

    public Memento getMemento(){
        Memento memento = mementos.get(0);
        this.mementos.remove(0);
        return memento;
    }
}