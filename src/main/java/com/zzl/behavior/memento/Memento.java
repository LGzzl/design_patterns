package com.zzl.behavior.memento;

/**
 * 备忘录
 * @author zzl
 * @since 2021/10/14
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
