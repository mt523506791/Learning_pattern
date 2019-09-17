package com.mt.designpatterns.beanpostprocessor;

import org.springframework.stereotype.Service;

/**
 * @ClassName HelloServiceImpl1
 * @Description
 * @Author maTao
 * @Date 2019/9/17 0017 下午 16:04
 **/
@Service
public class HelloServiceImpl1 implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("AAAAAAAAAAAAAAAA");
    }
}
