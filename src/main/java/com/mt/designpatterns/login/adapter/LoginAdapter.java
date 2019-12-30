package com.mt.designpatterns.login.adapter;


import com.mt.designpatterns.adapter.login.ResultMsg;

/**
 * 登录适配器
 */
public interface LoginAdapter {

    Boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);

}
