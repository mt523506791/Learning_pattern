package com.mt.designpatterns.chains;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by MT on 2019/6/17 0017 11:43
 */
@Slf4j
public class Encryption implements Process {
    @Override
    public void doProcess(String msg) {
      log.info("加密处理:{}", msg);
    }
}
