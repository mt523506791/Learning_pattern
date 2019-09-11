package com.mt.designpatterns.factory.abstractfactory;

import com.mt.designpatterns.factory.abstractfactory.interfaces.IVideo;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by MT on 2019/6/18 0018 14:32
 */
@Slf4j
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        log.info("编写IVideo笔记");
    }
}
