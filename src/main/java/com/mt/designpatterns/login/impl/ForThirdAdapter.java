package com.mt.designpatterns.login.impl;

import com.mt.designpatterns.login.IForThird;
import com.mt.designpatterns.login.ResultMsg;
import com.mt.designpatterns.login.adapter.LoginAdapter;
import com.mt.designpatterns.login.adapter.LoginForQQAdapter;
import com.mt.designpatterns.login.adapter.LoginForWeChatAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ForThirdAdapter extends LoginServiceImpl implements IForThird {

    @Override
    public ResultMsg login(String userName, String password) {
        return super.login(userName, password);
    }

    @Override
    public com.mt.designpatterns.adapter.login.ResultMsg loginForQQ(String id) {
      return processLogin(id,LoginForQQAdapter.class);
    }

    @Override
    public com.mt.designpatterns.adapter.login.ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWeChatAdapter.class);
    }


    /**
     *  工厂方法模式
     * @param key
     * @param clazz
     * @return
     */
    private com.mt.designpatterns.adapter.login.ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz){
        try {
            //  适配器不一定要实现接口
            LoginAdapter adapter = clazz.newInstance();
            //判断传过来的适配器是否能处理指定的逻辑
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
