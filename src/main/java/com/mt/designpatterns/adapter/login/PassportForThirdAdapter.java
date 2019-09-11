package com.mt.designpatterns.adapter.login;

import com.mt.designpatterns.adapter.login.impl.LoginForQQAdapter;
import com.mt.designpatterns.adapter.login.impl.LoginForTelAdapter;
import com.mt.designpatterns.adapter.login.impl.LoginForTokenAdapter;
import com.mt.designpatterns.adapter.login.impl.LoginForWechatAdapter;
import com.mt.designpatterns.adapter.login.service.IPassportForThird;
import com.mt.designpatterns.adapter.login.v1.SiginService;

/**
 * Created by MT on 2019/6/18 0018 10:47
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {


    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return this.processLogin(id, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone, LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
      super.regist(username,passport);
      return super.login(username,passport);
    }


    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz){
        try {
            // 适配器不一定要实现接口
            LoginAdapter adapter = clazz.newInstance();

            //判断传过来的适配器是否能处理指定的逻辑
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  null;

    }
}
