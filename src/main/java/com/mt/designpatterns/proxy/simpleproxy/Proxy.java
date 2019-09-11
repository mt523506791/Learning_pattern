package com.mt.designpatterns.proxy.simpleproxy;

/**
 * Created by MT on 2019/6/19 0019 10:13
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }


    @Override
    public void request() {

        before();
        subject.request();
        after();

    }
    public void before(){
        System.out.println("called before request().");
    }

    public void after(){
        System.out.println("called after request().");
    }


}
