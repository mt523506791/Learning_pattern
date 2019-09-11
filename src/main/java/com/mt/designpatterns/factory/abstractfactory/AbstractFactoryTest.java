package com.mt.designpatterns.factory.abstractfactory;

/**
 * Created by MT on 2019/6/18 0018 14:37
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();

    }
}
