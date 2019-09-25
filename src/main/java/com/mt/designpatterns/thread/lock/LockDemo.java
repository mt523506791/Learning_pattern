package com.mt.designpatterns.thread.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 我们以前理解的锁，基本都是排他锁，也就是这些锁在同一时刻只允许一个线程进
 * 行访问，而读写所在同一时刻可以允许多个线程访问，但是在写线程访问时，所有
 * 的读线程和其他写线程都会被阻塞。读写锁维护了一对锁，一个读锁、一个写锁 ;
 * 一般情况下，读写锁的性能都会比排它锁好，因为大多数场景读是多于写的。在读
 * 多于写的情况下，读写锁能够提供比排它锁更好的并发性和吞吐量
 */
public class LockDemo {


    static Map<String, Object> cacheMap = new HashMap<>();
    //  重入读写锁
    static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    static Lock read = rwl.readLock();
    static Lock write = rwl.writeLock();

    public static final Object get(String key) {
        System.out.println("开始读取数据");
        read.lock(); //读锁
        try {
            return cacheMap.get(key);
        }finally {
            read.unlock();
        }
    }


    public static final Object put(String key, Object value) {
        write.lock();
        System.out.println("开始写数据");
        try {
            return cacheMap.put(key, value);
        } finally {
            write.unlock();
        }
    }


    public static void main(String[] args) throws InterruptedException {

        for (int i= 0;i< 10;i++){
            new Thread(() ->{LockDemo.get("abc");
                LockDemo.put("abc","123456");
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(cacheMap.toString());

    }

}