package com.mt.designpatterns.factory.factorymethod;

import com.mt.designpatterns.factory.simplefactory.ICourse;

/**
 * Created by MT on 2019/6/18 0018 13:58
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        MethodFactory methodFactory = new JavaCourseFactory();
        ICourse course = methodFactory.create();
        course.read();

        methodFactory = new PythonCourseFactory();

        ICourse c = methodFactory.create();
        c.read();


    }

}
