package com.mt.designpatterns.login.controller;

import com.alibaba.fastjson.JSONObject;
import com.mt.designpatterns.login.IForThird;
import com.mt.designpatterns.login.ResultMsg;
import com.mt.designpatterns.login.impl.ForThirdAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName LoginController
 * @Description
 * @Author maTao
 * @Date 2019/12/30 0030 下午 15:31
 **/
@Controller
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private IForThird iForThird = new ForThirdAdapter();

    @RequestMapping("/login")
    public ResultMsg login(@RequestBody JSONObject jsonObject){
        return null;
    }


}
