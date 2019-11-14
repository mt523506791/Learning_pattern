package com.mt.designpatterns.singleton.lazysingleton;

/**
 * @ClassName LazySingleton
 * @Description  赖加载模式
 * @Author maTao
 * @Date 2019/11/14 0014 下午 14:46
 **/
public class LazySingleton {

    public LazySingleton() {
    }

    private static LazySingleton lazySingleton = null;

    public static synchronized LazySingleton getLazySingleton(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
