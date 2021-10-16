package com.zzl.behavior.iterator;

/**
 * @author zzl
 * @since 2021/10/15
 */
public class IteratorTest {

    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
