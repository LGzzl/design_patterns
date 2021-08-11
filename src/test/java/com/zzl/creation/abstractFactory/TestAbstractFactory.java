package com.zzl.creation.abstractFactory;

import com.zzl.creation.abstractFactory.factory.LearnJavaFactory;
import com.zzl.creation.abstractFactory.learn.LearnBook;
import com.zzl.creation.abstractFactory.learn.LearnVideo;

public class TestAbstractFactory {

    public static void main(String[] args) {
        LearnAbstractFactory learnJava = new LearnJavaFactory();
        LearnBook book = learnJava.getBookCourse();
        LearnVideo video = learnJava.getVideoCourse();
        book.info();
        System.out.println(book.author() + "price=" + book.price());
        video.info();
        System.out.println(video.author() + "price=" + video.price());
    }
}
