package com.mt.designpatterns.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName AckSender
 * @Description
 * @Author maTao
 * @Date 2019/12/23 0023 下午 16:33
 **/
@Service
public class AckSender implements RabbitTemplate.ReturnCallback {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(){
        String context = "你好现在是 " + new Date() +"";
        System.out.println("AckSender 发送的内容 : " + context);
        this.rabbitTemplate.setReturnCallback(this);
        this.rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
            if (!ack) {
                System.out.println("HelloSender消息发送失败" + cause + correlationData.toString());
            } else {
                System.out.println("HelloSender 消息发送成功 ");
            }
        });
        this.rabbitTemplate.convertAndSend("hello", context);

    }


    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {
        System.out.println("sender returnedMessage success" + message.toString()+"==="+i+"==="+s1+"==="+s2);
    }


}
