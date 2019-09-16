package com.mt.designpatterns.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyWebServerConfigurationProperties.class)
// @ConfigurationProperties和@EnableConfigurationProperties注解结合使用
public class MyWebServerConfiguration2 {

}
