package com.mt.designpatterns.thread.lock;

/**
 * 比如调用demo方法获得了当前的对象锁，
 * 然后在这个方法中再去调用demo2，
 * demo2中的存在同一个实例锁，
 * 这个时候当前线程会因为无法获得demo2的对象锁而阻塞，
 * 就会产生死锁。
 * 重入锁的设计目的是避免线程的死锁
 */
public class ReentrantDemo {
    public synchronized void demo() {
        System.out.println("begin:demo");
        demo2();
    }

    public void demo2() {
        synchronized (this) {
            System.out.println("begin:demo1");
        }
    }

    public static void main(String[] args) {
        ReentrantDemo rd = new ReentrantDemo();
        new Thread(rd::demo).start();

    }
}