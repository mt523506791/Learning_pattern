package com.mt.designpatterns.proxy.staticproxy;

import com.mt.designpatterns.proxy.Person;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by MT on 2019/6/18 0018 14:46
 */
@Slf4j
public class Son implements Person {
    @Override
    public void findLove() {
        log.info("儿子要求找女朋友");
    }
}
