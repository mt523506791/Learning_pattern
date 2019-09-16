package com.mt.designpatterns.controller;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mt.designpatterns.config.MyProps;
import com.mt.designpatterns.config.MyWebServerConfigurationProperties;
import com.mt.designpatterns.config.ThreadPoolBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PropsController
 * @Description
 * @Author maTao
 * @Date 2019/9/12 0012 下午 16:11
 **/
@RestController
@RequestMapping("/demo")
public class PropsController {

    @Autowired
    private MyProps myProps;

    @Autowired
    private MyWebServerConfigurationProperties properties;

    @Autowired
    private ThreadPoolBean threadPoolBean;

    @Autowired
    private ComboPooledDataSource comboPooledDataSource;


    @RequestMapping("/get")
    public String getProps(){
        return myProps.getSimpleProp() +myProps.getListProp1().toString();
    }

   @RequestMapping("/get1")
    public Integer getProps1(){
        return properties.getPort();
    }

    @RequestMapping("/get2")
    public String getProps2(){
        return threadPoolBean.toString();
    }

    @RequestMapping("/get3")
    public String getProps3(){
        return comboPooledDataSource.toString();
    }
}
