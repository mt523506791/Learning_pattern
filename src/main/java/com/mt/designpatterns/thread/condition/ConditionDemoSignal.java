package com.mt.designpatterns.thread.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ConditionDemoSignal
 * @Description
 * @Author maTao
 * @Date 2019/9/24 0024 下午 16:17
 **/
public class ConditionDemoSignal implements Runnable {

    private Lock lock;

    private Condition condition;

    public ConditionDemoSignal(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }



    @Override
    public void run() {
        System.out.println("begin -ConditionDemoSignal");
        try {
            lock.lock();
            // 而其他线程调用 condition 对象的 signal 或者 signalall 方法通
            //知并被阻塞的线程，然后自己执行 unlock 释放锁，被唤醒的线程获得之前的锁继续执行，最后释放锁。
            //  唤醒阻塞的线程
            condition.signal();
            System.out.println("end - ConditionDemoSignal");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
         Lock lock = new ReentrantLock();
         Condition condition =  lock.newCondition();
        try {
        ConditionDemoWait demoWait = new ConditionDemoWait(lock,condition);
        ConditionDemoSignal demoSignal = new ConditionDemoSignal(lock,condition);
        new Thread(() ->{
            demoSignal.run();
            demoWait.run();
        }).start();

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
