package com.mt.designpatterns.factory.simplefactory;

/**
 * Created by MT on 2019/6/18 0018 13:38
 */
public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz){
        if(null != clazz){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return  null;
    }


}
