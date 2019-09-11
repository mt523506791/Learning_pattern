package com.mt.designpatterns.factory.factorymethod;

import com.mt.designpatterns.factory.simplefactory.ICourse;
import com.mt.designpatterns.factory.simplefactory.JavaICouse;

/**
 * Created by MT on 2019/6/18 0018 13:50
 */
public class JavaCourseFactory implements MethodFactory {
    @Override
    public ICourse create() {
        return new JavaICouse();
    }


}
