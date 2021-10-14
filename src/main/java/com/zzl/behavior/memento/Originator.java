package com.zzl.behavior.memento;

/**
 * 原发器
 * @author zzl
 * @since 2021/8/22 18:15
 */
public class Originator {

    private String state;

    public void info(){
        System.out.println("原发器当前状态为:" + state);
    }

    public Memento saveState(){
        return new Memento(this.state);
    }

    public void revokeState(Memento memento){
        this.state = memento.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
