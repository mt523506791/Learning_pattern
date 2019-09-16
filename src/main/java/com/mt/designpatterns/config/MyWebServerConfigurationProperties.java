package com.mt.designpatterns.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my.webserver")  //没有使用@Component或@Confinguration，因此此对象不会注册到Spring容器中，需要@EnableConfigurationProperties引用
@Data
public class MyWebServerConfigurationProperties {
    private int port;
    private  ThreadPool threadPool;

    public static class ThreadPool {
        private int maxThreads;
        private int minThreads;
        private int idleTimeout;

        public int getIdleTimeout() {
            return idleTimeout;
        }

        public void setIdleTimeout(int idleTimeout) {
            this.idleTimeout = idleTimeout;
        }

        public int getMaxThreads() {
            return maxThreads;
        }

        public void setMaxThreads(int maxThreads) {
            this.maxThreads = maxThreads;
        }

        public int getMinThreads() {
            return minThreads;
        }

        public void setMinThreads(int minThreads) {
            this.minThreads = minThreads;
        }
    }
}