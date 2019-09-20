package com.mt.designpatterns.dynamicbean;

import com.mt.designpatterns.DesignPatternsApplication;
import lombok.Data;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * @ClassName MtServer
 * @Description  动态bena 的载入
 * @Author maTao
 * @Date 2019/7/12 0012 下午 15:55
 **/
@Data
public class MtServer {

    private String name;

    private String age;

    public void print(){

        System.out.println("动态载入bean,name="+name+"age="+age);

    }


    public static void main(String[] args) {
        //  获取spring context 上下文
        ApplicationContext ctx = (ApplicationContext) SpringApplication.run(DesignPatternsApplication.class,args);


        // 获取BeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory  =(DefaultListableBeanFactory)ctx.getAutowireCapableBeanFactory();

        //创建bean信息.

        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(MtServer.class);

        beanDefinitionBuilder.addPropertyValue("name","张三");
        beanDefinitionBuilder.addPropertyValue("age","30");


        //动态注册bean.

        defaultListableBeanFactory.registerBeanDefinition("mtserver",beanDefinitionBuilder.getBeanDefinition());


        //获取动态注册的bean.

        MtServer testService = ctx.getBean(MtServer.class);
        testService.print();
    }

}
