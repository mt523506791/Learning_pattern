package com.mt.designpatterns.singleton.innersingleton;

/**
 * @ClassName InnerSingleton
 * @Description 静态内部类的方式实现类的单例实例化
 * @Author maTao
 * @Date 2019/11/14 0014 下午 17:10
 **/
public class InnerSingleton {

    // 如果没使用的话，内部类是不加载的
    // 默认使用LazyInnerClassGeneral 的时候，会先初始化内部类
    private InnerSingleton(){
        if(LazyHolder.lazy != null){
            throw  new RuntimeException("不允许创建多个实例");
        }
    }


    //static 是为了使单例的空间共享
    // 保证这个方法不会被重写，重载
    public static InnerSingleton getInstance(){
        return LazyHolder.lazy;
    }


    // 默认不加载
    private static class LazyHolder{
        public static  final  InnerSingleton lazy = new InnerSingleton();

    }





}
