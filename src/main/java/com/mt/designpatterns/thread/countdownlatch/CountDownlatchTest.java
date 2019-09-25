package com.mt.designpatterns.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountDownlatchTest
 * @Description
 * @Author maTao
 * @Date 2019/9/25 0025 上午 10:55
 **/
public class CountDownlatchTest implements Runnable {


 /*   public static void main(String[] args) {

        CountDownLatch countDownlatch = new CountDownLatch(3);

        new Thread(() ->{
            System.out.println(""+Thread.currentThread().getName()+"-执行中");
            countDownlatch.countDown();
            System.out.println(""+Thread.currentThread().getName()+"-执行完毕");

        },"t1").start();

        new Thread(() ->{
            System.out.println(""+Thread.currentThread().getName()+"-执行中");
            countDownlatch.countDown();
            System.out.println(""+Thread.currentThread().getName()+"-执行完毕");
        },"t2").start();

        new Thread(() ->{
            System.out.println(""+Thread.currentThread().getName()+"-执行中");
            countDownlatch.countDown();
            System.out.println(""+Thread.currentThread().getName()+"-执行完毕");
        },"t3").start();


    }*/


    // 高并发场景

    static CountDownLatch downLatch = new CountDownLatch(1);

    /**
     * 开始线程
     */
    public static void start(){
        CountDownlatchTest countDownlatchTest = new CountDownlatchTest();
        countDownlatchTest.start();
    }


    @Override
    public void run() {
        try {
            downLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ThreadName:"+Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        for (int i=0;i < 1000;i++){


        }
        downLatch.countDown();

    }

}
