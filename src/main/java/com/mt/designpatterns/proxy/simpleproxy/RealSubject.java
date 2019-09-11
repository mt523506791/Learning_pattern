package com.mt.designpatterns.proxy.simpleproxy;

/**
 * Created by MT on 2019/6/19 0019 10:12
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
