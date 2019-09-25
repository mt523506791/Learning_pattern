package com.mt.designpatterns.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AtomicDemo {

    // 实例化重入锁
    static Lock lock = new ReentrantLock();

    private static int count = 0;

    public static void inc(){
     // 加锁
    lock.lock();
    try {
        Thread.sleep(1);
    } catch (InterruptedException e) {
        e.printStackTrace(); }
    count++;
    // 释放锁
    lock.unlock();
    }

    public static void main(String[] args) {

        for(int i = 0 ; i< 1000; i++){

            new Thread(() ->{AtomicDemo.inc();}).start();

        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("result:"+count);

    }

}