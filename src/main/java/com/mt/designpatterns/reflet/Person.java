package com.mt.designpatterns.reflet;

import lombok.Data;

/**
 * Created by MT on 2019/6/19 0019 13:38
 */
@Data
public class Person {

    private String name;
    private int age;
    private String ss = "msg";


    public void fun(){
        System.out.println("fffffffffffffff");
    }

    public void fun(String name,int age) {
        System.out.println("我叫"+name+",今年"+age+"岁");
    }




}
