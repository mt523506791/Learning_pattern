package com.mt.designpatterns.singleton.lazysingleton;

/**
 * @ClassName ExectorThread
 * @Description
 * @Author maTao
 * @Date 2019/11/14 0014 下午 14:52
 **/
public class ExectorThread implements Runnable {
    @Override
    public void run() {

        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        System.out.println(Thread.currentThread().getName() + ":" + lazySingleton);

    }


    public static void main(String[] args) {

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();

        System.out.println("end");


    }


}
