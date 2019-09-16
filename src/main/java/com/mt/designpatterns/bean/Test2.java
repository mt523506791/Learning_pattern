package com.mt.designpatterns.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @ClassName Test2
 * @Description 现InitializingBean接口
 * @Author maTao
 * @Date 2019/9/16 0016 上午 11:28
 **/
@Configuration
public class Test2 implements InitializingBean {

    @Autowired
    Environment environment;

    @Override
    public void afterPropertiesSet() throws Exception {
        String property = environment.getProperty("db.username");
        System.out.println("Test2 "+property);
    }
}
