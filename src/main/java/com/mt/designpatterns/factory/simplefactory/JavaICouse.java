package com.mt.designpatterns.factory.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by MT on 2019/6/18 0018 13:30
 */
@Slf4j
public class JavaICouse implements ICourse {
    @Override
    public void read() {
        log.info("学习java:{}","java");
    }
}
