package com.mt.designpatterns.singleton.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ContainerSingleton
 * @Description  容器式注册单例模式
 * @Author maTao
 * @Date 2019/11/14 0014 下午 17:38
 **/
public class ContainerSingleton {

    public ContainerSingleton() {

    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    /**
     * 容器式写法适用于创建实例非常多的情况，便于管理。但是，是非线程安全的
     *
     * @param className
     * @return
     */
    public static Object getBean(String className) {
        synchronized (ioc) {
            Object object = null;
            if (!ioc.containsKey(className)) {
                try {
                    object = Class.forName(className).newInstance();
                    ioc.put(className, object);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return object;
            }else{
                return ioc.get(className);
            }
        }
    }


}
