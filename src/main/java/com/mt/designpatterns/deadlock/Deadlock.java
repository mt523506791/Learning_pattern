package com.mt.designpatterns.deadlock;

/**
 * @ClassName Deadlock
 * @Description  多线程死锁
 * @Author maTao
 * @Date 2019/9/20 0020 下午 17:22
 **/
public class Deadlock implements Runnable{

    private  Thread t;
    private  String threadName;

    public Deadlock(String threadName) {
        this.threadName = threadName;
    }

    /***
     * 方法一
     */
    private   void method1(){
        synchronized (String.class){
            System.out.println("method1获取String 锁");
        }
        synchronized (Integer.class){
            System.out.println("method1 获取的Integer");
        }
    }

    /**
     * 方法二
     */
    private  void method2(){
        synchronized (Integer.class){
            System.out.println("method2 获取的Integer");
        }
        synchronized (String.class){
            System.out.println("method2 获取的String");
        }
    }


    @Override
    public void run() {
        method1();
        method2();
    }

    public void start () {
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }


    public static void main(String[] args) {
        Deadlock R1 = new Deadlock( "Thread-1");
        R1.start();
        Deadlock R2 = new Deadlock( "Thread-2");
        R2.start();
    }


}
