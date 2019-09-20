package com.mt.designpatterns.decorator.v2;

/**
 * @ClassName Chilli
 * @Description
 * @Author maTao
 * @Date 2019/9/20 0020 下午 16:14
 **/
public class Chilli extends Condiment {

    private Humburger humburger;

    public Chilli(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName() + "加辣子";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice() + 0;
    }
}
