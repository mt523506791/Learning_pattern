package com.mt.designpatterns.decorator.v2;

/**
 * @ClassName ChickenBurger
 * @Description  被装饰者的初始状态，有些自己的简单装饰
 * @Author maTao
 * @Date 2019/9/20 0020 下午 16:04
 **/
public class ChickenBurger extends Humburger {

    public ChickenBurger() {
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
