package com.mt.designpatterns.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @ClassName Test3
 * @Description  实现BeanPostProcessor接口
 * @Author maTao
 * @Date 2019/9/16 0016 上午 11:30
 **/
//@Configuration
public class Test3 implements BeanPostProcessor {

    @Autowired
    Environment environment;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        String property = environment.getProperty("db.username");
        System.out.println("Test3 "+ property);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
