package com.mt.designpatterns.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyWebServerConfiguration1
 * @Description
 * @Author maTao
 * @Date 2019/9/12 0012 下午 17:32
 **/
@Configuration  //这是一个配置类，与@Service、@Component的效果类似。spring会扫描到这个类，@Bean才会生效，将ThreadPoolBean这个返回值类注册到spring上下文环境中
@EnableConfigurationProperties(MyWebServerConfigurationProperties.class) //通过这个注解, 将MyWebServerConfigurationProperties这个类的配置到上下文环境中,本类中使用的@Autowired注解注入才能生效
public class MyWebServerConfiguration {
    @SuppressWarnings("SpringJavaAutowiringInspection") //加这个注解让IDE 不报: Could not autowire

    @Autowired
    private MyWebServerConfigurationProperties properties;

    @Bean //@Bean注解在方法上,返回值是一个类的实例,并声明这个返回值(返回一个对象)是spring上下文环境中的一个bean
    public ThreadPoolBean getThreadBean() {

        MyWebServerConfigurationProperties.ThreadPool threadPool = properties.getThreadPool();
        ThreadPoolBean threadPoolBean = new ThreadPoolBean();
        threadPoolBean.setIdleTimeout(threadPool.getIdleTimeout());
        threadPoolBean.setMaxThreads(threadPool.getMaxThreads());
        threadPoolBean.setMinThreads(threadPool.getMinThreads());
        return threadPoolBean;
    }


}
