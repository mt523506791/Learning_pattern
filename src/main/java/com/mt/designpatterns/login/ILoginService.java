package com.mt.designpatterns.login;

/**
 * @ClassName ILoginService
 * @Description
 * @Author maTao
 * @Date 2019/12/30 0030 下午 15:18
 **/
public interface ILoginService {

    /**
     *  原始登录方法
     * @param userName
     * @param password
     * @return
     */
    ResultMsg login(String userName,String password);



}

