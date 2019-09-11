package com.mt.designpatterns.chains;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by MT on 2019/6/17 0017 11:39
 */
@Slf4j
public class SensitiveWordProcess implements Process {
    @Override
    public void doProcess(String msg) {
      log.info("敏感词处理:{}", msg);
    }
}
