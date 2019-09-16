package com.mt.designpatterns.config;

import lombok.Data;

/**
 * @Bean配置第三方组件(Third-party configuration)
 */
@Data
public class ThreadPoolBean {
    private int maxThreads;
    private int minThreads;
    private int idleTimeout;


}