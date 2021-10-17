package com.zzl.behavior.mediator;

/**
 * @author zzl
 * @since 2021/10/17
 */
public abstract class UserColleague {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserColleague(String name) {
        this.name = name;
    }

    /**
     * 发信息方法
     * @param msg 发送的信息
     * @param chatRoom 聊天室中介者
     */
    public abstract void send(ChatRoomMediator chatRoom, String msg);

    /**
     * 接收信息方法
     * @param msg 接收的信息
     */
    public abstract void receive(String msg);
}
