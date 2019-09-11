package com.mt.designpatterns.reflet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by MT on 2019/6/19 0019 13:41
 */
public class Reflet {

    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.mt.designpatterns.reflet.Person");
            try {
                Object o = c.newInstance();
                try {
                    Method method = c.getMethod("fun", String.class, int.class);
                    method.invoke(o, "tengj", 10);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
