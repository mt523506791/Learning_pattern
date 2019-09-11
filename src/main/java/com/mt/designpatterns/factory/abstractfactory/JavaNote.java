package com.mt.designpatterns.factory.abstractfactory;

import com.mt.designpatterns.factory.abstractfactory.interfaces.INote;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by MT on 2019/6/18 0018 14:31
 */
@Slf4j
public class JavaNote implements INote {
    @Override
    public void edit() {
            log.info("编写Java笔记");
    }
}
