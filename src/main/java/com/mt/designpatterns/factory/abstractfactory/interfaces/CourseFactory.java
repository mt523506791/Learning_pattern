package com.mt.designpatterns.factory.abstractfactory.interfaces;

/**
 * Created by MT on 2019/6/18 0018 14:05
 */
public interface CourseFactory {

    INote createNote();

    IVideo createVideo();


}
