package com.mt.designpatterns.controller;

import com.mt.designpatterns.config.environment.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @ClassName PropertiesController
 * @Description
 * @Author maTao
 * @Date 2019/9/16 0016 上午 10:32
 **/
@RestController
public class PropertiesController {

    @Autowired
    private PropertiesConfig propertiesConfig;


    @Autowired
    private Environment environment;

    /**
     *
     * 第一种方式：使用`@ConfigurationProperties`注解将配置文件属性注入到配置对象类中
     *
     * @author zyd
     * @throws UnsupportedEncodingException
     * @since JDK 1.7
     */
    @RequestMapping("/config")
    public Map<String, Object> configurationProperties() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("type", propertiesConfig.getType3());
        map.put("title", propertiesConfig.getTitle3());
        map.put("login", propertiesConfig.getLogin());
        map.put("urls", propertiesConfig.getUrls());
        return map;
    }

    /**
     *
     * 第三种方式：使用`Environment`
     *
     * @author zyd
     * @throws UnsupportedEncodingException
     * @since JDK 1.7
     */
    @RequestMapping("/env")
    public Map<String, Object> env() throws UnsupportedEncodingException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("type", environment.getProperty("com.zyd.type2"));
        map.put("title", new String(environment.getProperty("com.zyd.title2").getBytes("ISO-8859-1"), "UTF-8"));
        return map;
    }

}
