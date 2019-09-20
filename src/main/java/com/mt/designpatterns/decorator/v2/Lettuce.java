package com.mt.designpatterns.decorator.v2;

/**
 * @ClassName Lettuce
 * @Description
 * @Author maTao
 * @Date 2019/9/20 0020 下午 16:11
 **/
public class Lettuce extends Condiment {

    private Humburger humburger;

    public Lettuce(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName()+"我要加生菜";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice() + 1.5;
    }




}
