package com.mt.designpatterns.adapter.login.impl;


import com.mt.designpatterns.adapter.login.LoginAdapter;
import com.mt.designpatterns.adapter.login.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public Boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }
    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
