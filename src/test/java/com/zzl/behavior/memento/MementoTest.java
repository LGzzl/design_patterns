package com.zzl.behavior.memento;

/**
 * @author zzl
 * @since 2021/10/14
 */
public class MementoTest {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("state==>1");
        originator.info();
        originator.setState("state==>2");
        originator.info();
        careTaker.saveMemento(originator.saveState());
        originator.setState("state==>3");
        originator.info();
        //后悔了,撤销为之前的状态
        originator.revokeState(careTaker.getMemento());
        originator.info();
    }
}
