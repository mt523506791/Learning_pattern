package com.mt.designpatterns.adapter.login.impl;

import com.mt.designpatterns.adapter.login.PassportForThirdAdapter;
import com.mt.designpatterns.adapter.login.service.IPassportForThird;

/**
 * Created by MT on 2019/6/18 0018 11:02
 */
public class PassportTest {

    public static void main(String[] args) {

        IPassportForThird iPassportForThird = new PassportForThirdAdapter();
        iPassportForThird.loginForQQ("523506791");
        iPassportForThird.loginForWechat("wechat");

    }

}
