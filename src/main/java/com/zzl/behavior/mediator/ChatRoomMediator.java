package com.zzl.behavior.mediator;

import java.time.LocalDate;

/**
 * 模拟一个聊天室中介者
 * @author zzl
 * @since 2021/10/17
 */
public class ChatRoomMediator {

    private final ConcreteUserColleague1 userColleague1;
    private final ConcreteUserColleague2 userColleague2;

    public ChatRoomMediator(ConcreteUserColleague1 userColleague1, ConcreteUserColleague2 userColleague2) {
        this.userColleague1 = userColleague1;
        this.userColleague2 = userColleague2;
    }

    public void send(UserColleague userColleague, String msg){
        LocalDate now = LocalDate.now();
        if (userColleague.equals(userColleague1)){
            userColleague2.receive(now + ":" + userColleague1.getName() + ":" + msg);
        }else {
            userColleague1.receive(now + ":" + userColleague2.getName() + ":" + msg);
        }
    }
}
