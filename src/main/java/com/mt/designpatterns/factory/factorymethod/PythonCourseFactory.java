package com.mt.designpatterns.factory.factorymethod;

import com.mt.designpatterns.factory.simplefactory.CICourse;
import com.mt.designpatterns.factory.simplefactory.ICourse;

/**
 * Created by MT on 2019/6/18 0018 13:55
 */
public class PythonCourseFactory implements MethodFactory {


    @Override
    public ICourse create() {
        return new CICourse();
    }
}
