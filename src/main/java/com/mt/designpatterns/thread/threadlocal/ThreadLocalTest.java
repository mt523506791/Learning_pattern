package com.mt.designpatterns.thread.threadlocal;

/**
 * @ClassName ThreadLocalTest
 * @Description  线程副本
 * @Author maTao
 * @Date 2019/9/26 0026 下午 14:38
 **/
public class ThreadLocalTest {

    /**
     *   1.没有先set，直接get的话，运行时会报空指针异常。
     *   2.重写了initialValue方法：
     */

    ThreadLocal<Long> threadLocal = new ThreadLocal<Long>(){
        @Override
        protected Long initialValue() {
            return Thread.currentThread().getId();
        }
    };

    ThreadLocal<String> stringThreadLocal = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };

    public void set() {
        threadLocal.set(Thread.currentThread().getId());
        stringThreadLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return threadLocal.get();
    }

    public String getString() {
        return stringThreadLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final ThreadLocalTest test = new ThreadLocalTest();

        //test.set();
        System.out.println("1"+test.getLong());
        System.out.println("1"+test.getString());


        Thread thread1 = new Thread(){
            public void run() {
                //test.set();
                System.out.println(test.getLong());
                System.out.println(test.getString());
            };
        };
        thread1.start();
        thread1.join();

        System.out.println(test.getLong());
        System.out.println(test.getString());
    }

}
