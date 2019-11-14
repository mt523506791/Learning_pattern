package com.mt.designpatterns.singleton.hungry;

/**
 * @ClassName HungrySingleton
 * @Description  懒汉模式单例模式
 * @Author maTao
 * @Date 2019/11/14 0014 下午 14:18
 **/
public class HungrySingleton {

    private  static  HungrySingleton hungrySingleton = new HungrySingleton();


    public HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
