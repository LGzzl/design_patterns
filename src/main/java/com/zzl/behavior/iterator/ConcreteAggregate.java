package com.zzl.behavior.iterator;

/**
 * @author zzl
 * @since 2021/10/17
 */
public class ConcreteAggregate implements Aggregate {

    private final String[] strings = {"str1","str2","str3","str4","str5"};

    @Override
    public Iterator iterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator {

        int cursor = 0;

        ConcreteIterator() {}

        @Override
        public Object next() {
            if (hasNext()){
                return strings[cursor++];
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            return strings.length > cursor;
        }
    }
}
