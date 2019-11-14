package com.mt.designpatterns.singleton.hungry;

/**
 * @ClassName StaticSingleton
 * @Description  静态方法单例模式
 * @Author maTao
 * @Date 2019/11/14 0014 下午 14:27
 **/
public class StaticSingleton {

    private static final StaticSingleton  singleton ;

    static {
        singleton = new StaticSingleton();
    }

    public StaticSingleton() {
    }

    public static  StaticSingleton getInstance(){
        return singleton;
    }

}
