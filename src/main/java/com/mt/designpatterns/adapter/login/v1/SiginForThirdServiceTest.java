package com.mt.designpatterns.adapter.login.v1;

/**
 * Created by MT on 2019/6/18 0018 10:43
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("mt","123456");
        service.loginForQQ("523506791");
        service.loginForWechat("sdfasfsa");
    }

}
