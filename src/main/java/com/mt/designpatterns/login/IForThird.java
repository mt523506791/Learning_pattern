package com.mt.designpatterns.login;


import com.mt.designpatterns.adapter.login.ResultMsg;

/**
 *  第三方登录  只扩展不修改
 */
public interface IForThird {

    /**
     * QQ登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    com.mt.designpatterns.adapter.login.ResultMsg loginForWechat(String id);




}
