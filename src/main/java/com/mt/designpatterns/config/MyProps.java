package com.mt.designpatterns.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MyProps
 * @Description 接收application.yml中的myProps下面的属性
 * @Author maTao
 * @Date 2019/9/12 0012 下午 16:06
 **/
// 加这个注解的话, 使用@Autowired 就不能注入进去了  把普通的pojo 注入到springioc 容器中 当这个类不确定是那个类型的时候用 @Component

// @Component  (//没有使用@Component或@Confinguration，因此此对象不会注册到Spring容器中，需要@EnableConfigurationProperties引用)
//  配置文件中的前缀
@Component
@ConfigurationProperties(prefix = "myprops")
@Data
public class MyProps {

    private String simpleProp;
    private String[] arrayProps;
    private List<Map<String, String>> listProp1 = new ArrayList<>(); //接收prop1里面的属性值,List中的元素是Map
    private List<String> listProp2 = new ArrayList<>(); //接收prop2里面的属性值
    private Map<String, String> mapProps = new HashMap<>(); //接收prop1里面的属性值
}
