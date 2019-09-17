package com.mt.designpatterns.controller;

import com.mt.designpatterns.beanpostprocessor.HelloService;
import com.mt.designpatterns.beanpostprocessor.RountingInjected;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName BeanPostController
 * @Description
 * @Author maTao
 * @Date 2019/9/17 0017 下午 16:14
 **/
@Controller
@RequestMapping("/bean")
public class BeanPostController {


  /*  @RountingInjected
    private HelloService helloService;*/

    @RountingInjected("helloServiceImpl2")
    private HelloService helloService2;


   /* @RequestMapping("/say")
     public void say(){
         helloService.sayHello();
     }*/

    @RequestMapping("/say2")
    public void say2(){
        helloService2.sayHello();
    }


}
