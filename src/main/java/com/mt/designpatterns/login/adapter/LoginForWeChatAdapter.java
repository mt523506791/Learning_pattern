package com.mt.designpatterns.login.adapter;

import com.mt.designpatterns.adapter.login.ResultMsg;

public class LoginForWeChatAdapter implements LoginAdapter {


    @Override
    public Boolean support(Object adapter) {
        return adapter instanceof LoginForWeChatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        
        return null;
    }
}
