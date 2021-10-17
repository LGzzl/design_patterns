package com.zzl.behavior.mediator;

/**
 * @author zzl
 * @since 2021/10/17
 */
public class MediatorTest {

    public static void main(String[] args) {
        ConcreteUserColleague1 colleague1 = new ConcreteUserColleague1("小王");
        ConcreteUserColleague2 colleague2 = new ConcreteUserColleague2("小李");
        ChatRoomMediator chatRoom = new ChatRoomMediator(colleague1, colleague2);
        colleague1.send(chatRoom, "早上好");
        colleague2.send(chatRoom, "吃早饭了吗");
    }
}
