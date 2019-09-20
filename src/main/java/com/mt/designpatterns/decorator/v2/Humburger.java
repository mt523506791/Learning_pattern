package com.mt.designpatterns.decorator.v2;

/**
 * @ClassName Humburger
 * @Description  被装饰者
 * @Author maTao
 * @Date 2019/9/20 0020 下午 16:02
 **/
public abstract class Humburger {

    public String getName() {
        return name;
    }

    protected  String name;

    public abstract double getPrice();


}
