package com.mt.designpatterns.singleton.lazysingleton;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Description  懒加载 双重检查锁的的方式实现多线 单例模式的安全
 * @Author maTao
 * @Date 2019/11/14 0014 下午 15:02
 **/
public class LazyDoubleCheckSingleton {


    public LazyDoubleCheckSingleton() {
    }

    /**
     * 保证内存的可见性 和防止指定重排序
     */
    private static  volatile  LazyDoubleCheckSingleton singleton = null;


    public static  LazyDoubleCheckSingleton getSingleton(){
        if(singleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(singleton == null){
                    singleton =  new LazyDoubleCheckSingleton();
                }

            }

        }
        return singleton;
    }


}
