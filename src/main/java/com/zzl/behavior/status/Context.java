package com.zzl.behavior.status;

/**
 *
 * @author zzl
 * @since 2021/9/21 8:57
 */
public class Context {

    private Status status;

    public Context() {
        //设置一个默认状态
        this.status = new ConcreteStatus1();
    }

    public void request(){
        status.handler(this);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
