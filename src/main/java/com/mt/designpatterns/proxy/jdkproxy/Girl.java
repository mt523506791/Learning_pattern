package com.mt.designpatterns.proxy.jdkproxy;

import com.mt.designpatterns.proxy.Person;

/**
 * Created by MT on 2019/6/19 0019 11:18
 */
public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
