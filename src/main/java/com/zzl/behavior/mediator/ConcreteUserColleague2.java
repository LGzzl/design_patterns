package com.zzl.behavior.mediator;

/**
 * @author zzl
 * @since 2021/10/17
 */
public class ConcreteUserColleague2 extends UserColleague {

    public ConcreteUserColleague2(String name) {
        super(name);
    }

    @Override
    public void send(ChatRoomMediator chatRoom, String msg) {
        chatRoom.send(this,msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println(msg);
        System.out.println("用户2收到了消息,但是没有任何表示");
    }
}
