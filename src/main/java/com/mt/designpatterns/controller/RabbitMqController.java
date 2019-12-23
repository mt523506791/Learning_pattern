package com.mt.designpatterns.controller;

import com.mt.designpatterns.rabbitmq.AckSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName RabbitMqController
 * @Description
 * @Author maTao
 * @Date 2019/12/23 0023 下午 17:01
 **/
@Controller
public class RabbitMqController {


    @Autowired
    private AckSender ackSender;

    /**
     * 单生产者-单个消费者
     */
    @RequestMapping("/test")
    public String hello() throws Exception {
        ackSender.send();
        return "OK";
    }



}
