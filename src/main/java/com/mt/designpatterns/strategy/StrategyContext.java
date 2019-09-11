package com.mt.designpatterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by MT on 2019/6/17 0017 17:52
 * 策略上下文
 *
 */
@Slf4j
public class StrategyContext {

    // 持有一个策略实现的引用
    private IStrategy iStrategy;


    /**
     * 使用构造器注入具体的策略类
     * @param iStrategy
     */
    public StrategyContext(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }


    public void contextMethod(){
        // 调用策略实现的方法
        iStrategy.algorithmMethod();
    }



}
