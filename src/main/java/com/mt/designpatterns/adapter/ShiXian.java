package com.mt.designpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by MT on 2019/6/18 0018 9:40
 * 适配器的实现类
 */
@Slf4j
public class ShiXian extends Adapter{

    public void a (){
        super.method1();
        log.info("实现方法A的方法","method1 A");
    }

    public void b(){
        super.method2();
        log.info("实现方法B的方法","method2 B");
    }


}
