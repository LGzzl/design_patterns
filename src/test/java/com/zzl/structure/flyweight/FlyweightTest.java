package com.zzl.structure.flyweight;

import java.util.Random;

public class FlyweightTest {

    public static void main(String[] args) {
        String[] books = {"庄子","史记","孙子兵法","红楼梦","钢铁是怎样炼成的","战争与和平","爱的教育"};
        FlyweightBookFactory bookFactory = new FlyweightBookFactory();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            LiteratureBook book = bookFactory.getLiteratureBook(books[random.nextInt(7)]);
            book.setUseName("张" + i);
            book.read();
            bookFactory.countBookshelf();
        }
    }
}
