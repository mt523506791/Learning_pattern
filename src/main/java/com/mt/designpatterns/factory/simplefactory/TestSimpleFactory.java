package com.mt.designpatterns.factory.simplefactory;

/**
 * Created by MT on 2019/6/18 0018 13:35
 */
public class TestSimpleFactory {

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse iCourse = factory.create(JavaICouse.class);
        iCourse.read();

    }

}
