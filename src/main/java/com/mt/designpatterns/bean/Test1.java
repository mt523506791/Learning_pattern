package com.mt.designpatterns.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

/**
 * @ClassName test1
 * @Description
 * @Author maTao
 * @Date 2019/9/16 0016 上午 10:10
 **/
@Configuration
public class Test1 {

    @Autowired
    private Environment environment;


    @PostConstruct
    private void test(){
        String property = environment.getProperty("db.username");
        String propertypwd = environment.getProperty("db.password");
        System.out.println("test1"+property);

    }


}
