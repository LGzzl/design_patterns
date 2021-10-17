package com.zzl.behavior.mediator;

/**
 * @author zzl
 * @since 2021/10/17
 */
public class ConcreteUserColleague1 extends UserColleague {

    public ConcreteUserColleague1(String name) {
        super(name);
    }

    @Override
    public void send(ChatRoomMediator chatRoom, String msg) {
        chatRoom.send(this,msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println(msg);
        System.out.println("用户1收到了消息,并且回复了");
    }
}
