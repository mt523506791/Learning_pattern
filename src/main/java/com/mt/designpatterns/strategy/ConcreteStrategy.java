package com.mt.designpatterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by MT on 2019/6/17 0017 17:31
 */
@Slf4j
public class ConcreteStrategy implements IStrategy {
    @Override
    public void algorithmMethod() {
        log.info("this is ConcreteStrategy method:{}","11");

    }
}
