package com.mt.designpatterns.deadlock;

/**
 * @ClassName Deadlock
 * @Description  多线程死锁
 * @Author maTao
 * @Date 2019/9/20 0020 下午 17:22
 **/
public class Deadlock {


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

      class  DeadlockString implements Runnable{
        @Override
        public void run() {
            method1();
        }
    }


     class DeadlockInteger extends Thread {
        @Override
        public void run() {
            method2();
        }

    }

    public static void main(String[] args) {
        Deadlock d = new Deadlock();
        d.method1();
        d.method2();

    }


}
