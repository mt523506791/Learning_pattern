package com.mt.designpatterns.proxy.staticproxy;

import com.mt.designpatterns.proxy.Person;

/**
 * Created by MT on 2019/6/18 0018 14:47
 */
public class Father implements Person {

    public Father(Son person) {
        this.person = person;
    }

    private Son person;




    @Override
    public void findLove() {
        System.out.println("父亲物色对象");
        this.person.findLove();
        System.out.println("双方父母同意，确立关系");
    }
}
