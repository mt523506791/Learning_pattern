package com.mt.designpatterns.adapter.login.impl;

import com.mt.designpatterns.adapter.login.LoginAdapter;
import com.mt.designpatterns.adapter.login.ResultMsg;

/**
 * Created by MT on 2019/6/18 0018 10:18
 */
public class LoginForSinaAdapter implements LoginAdapter {
    @Override
    public Boolean support(Object adapter) {
        if(adapter instanceof LoginForSinaAdapter){
            return Boolean.TRUE;
        }
         return Boolean.FALSE;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
