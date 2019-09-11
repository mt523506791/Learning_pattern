package com.mt.designpatterns.proxy.staticproxy;

/**
 * Created by MT on 2019/6/18 0018 14:55
 */
public class FatherProxyTest {

    public static void main(String[] args) {

        Father father = new Father(new Son());
        father.findLove();


    }

}
