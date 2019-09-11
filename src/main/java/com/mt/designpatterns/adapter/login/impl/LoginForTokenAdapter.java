package com.mt.designpatterns.adapter.login.impl;

import com.mt.designpatterns.adapter.login.LoginAdapter;
import com.mt.designpatterns.adapter.login.ResultMsg;

/**
 * Created by MT on 2019/6/18 0018 10:20
 */
public class LoginForTokenAdapter implements LoginAdapter {
    @Override
    public Boolean support(Object adapter) {
        if(adapter instanceof LoginForTokenAdapter){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
