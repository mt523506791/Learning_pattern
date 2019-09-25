package com.mt.designpatterns.thread.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @ClassName ConditionDemoWait
 * @Description
 * @Author maTao
 * @Date 2019/9/24 0024 下午 16:15
 **/
public class ConditionDemoWait implements Runnable {

    private Lock lock;

    private Condition condition;

    public ConditionDemoWait(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }




    @Override
    public void run() {
        System.out.println("begin -ConditionDemoWait");
            try {
                lock.lock();
                // 当调用 await 方法后，当前线程
                //会释放锁并等待，而其他线程调用
                //  await 把当前线程阻塞挂起
                condition.await();
                System.out.println("end - ConditionDemoWait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }

    }
}
