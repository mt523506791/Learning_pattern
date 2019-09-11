package com.mt.designpatterns.adapter.login.impl;

import com.mt.designpatterns.adapter.login.LoginAdapter;
import com.mt.designpatterns.adapter.login.ResultMsg;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by MT on 2019/6/18 0018 10:22
 */
@Slf4j
public class LoginForWechatAdapter implements LoginAdapter {
    @Override
    public Boolean support(Object adapter) {
        if(adapter instanceof LoginForWechatAdapter){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        log.info("我是微信登录{},{}", id, adapter.toString());
        return new ResultMsg(200, "登录成功", adapter.toString());
    }
}
