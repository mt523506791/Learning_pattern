package com.mt.designpatterns.factory.abstractfactory;

import com.mt.designpatterns.factory.abstractfactory.interfaces.CourseFactory;
import com.mt.designpatterns.factory.abstractfactory.interfaces.INote;
import com.mt.designpatterns.factory.abstractfactory.interfaces.IVideo;

/**
 * Created by MT on 2019/6/18 0018 14:30
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
