package com.mt.designpatterns.decorator.v1;

/**
 * @ClassName Decorator
 * @Description
 * @Author maTao
 * @Date 2019/9/20 0020 下午 15:33
 **/
public abstract class Decorator implements Human{

    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    public void wearClothes() {
        human.wearClothes();
    }

    public void walkToWhere() {
        human.walkToWhere();
    }
}
