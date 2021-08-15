package com.zzl.structure.flyweight;

import java.util.HashMap;

/**
 * 享元工厂
 * @author zzl
 * @since 2021/8/15 11:55
 */
public class FlyweightBookFactory {

    private final HashMap<String, Book> bookshelf = new HashMap<>(64);

    public LiteratureBook getLiteratureBook(String bookName){
        Book book = bookshelf.get(bookName);
        if (book == null){
            LiteratureBook literatureBook = new LiteratureBook(bookName);
            bookshelf.put(bookName,literatureBook);
            book = literatureBook;
        }
        return (LiteratureBook)book;
    }

    public void countBookshelf(){
        System.out.println("当前书架有" + bookshelf.size() + "本书");
    }
}
