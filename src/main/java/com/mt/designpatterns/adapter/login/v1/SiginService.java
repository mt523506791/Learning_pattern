package com.mt.designpatterns.adapter.login.v1;

import com.mt.designpatterns.adapter.login.Member;
import com.mt.designpatterns.adapter.login.ResultMsg;

/**
 * Created by MT on 2019/6/18 0018 10:41
 */
public class SiginService {


    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }


}



