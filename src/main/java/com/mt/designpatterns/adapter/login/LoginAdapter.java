package com.mt.designpatterns.adapter.login;

/**
 * Created by MT on 2019/6/18 0018 10:11
 *  在适配器里面，这个接口是可有可无，不要跟模板模式混淆
 *   模板模式一定是抽象类，而这里仅仅只是一个接口
 */
public interface LoginAdapter {

    Boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);




}
