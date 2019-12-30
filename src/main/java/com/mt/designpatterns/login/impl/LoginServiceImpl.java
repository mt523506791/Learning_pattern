package com.mt.designpatterns.login.impl;

import com.mt.designpatterns.login.ILoginService;
import com.mt.designpatterns.login.ResultMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName LoginServiceImpl
 * @Description
 * @Author maTao
 * @Date 2019/12/30 0030 下午 15:28
 **/

@Slf4j
@Service
public class LoginServiceImpl implements ILoginService {
    @Override
    public ResultMsg login(String userName, String password) {
        return new ResultMsg(200,"成功",null);
    }
}
