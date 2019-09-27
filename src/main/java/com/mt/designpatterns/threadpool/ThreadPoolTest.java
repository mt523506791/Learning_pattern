package com.mt.designpatterns.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ThreadPoolTest
 * @Description
 * @Author maTao
 * @Date 2019/9/27 0027 上午 9:28
 **/
public class ThreadPoolTest implements Runnable {


    //  线程池工厂类  Executors

    /**
     * newFixedThreadPool
     *   该方法返回一个固定数量的线程池，线程数不变，当有一个任务提交
     *     时，若线程池中空闲，则立即执行，若没有，则会被暂缓在一个任务队列中，等待有空闲的
     *     线程去执行。
     */


    /**
     * newSingleThreadExecutor
     * 创建一个线程的线程池，若空闲则执行，若没有空闲线程则暂缓
     * 在任务队列中。
     */

    /**
     * newCachedThreadPool
     * 返回一个可根据实际情况调整线程个数的线程池，不限制最大线程
     * 数量，若用空闲的线程则执行任务，若无任务则不创建线程。并且每一个空闲线程会在 60 秒
     * 后自动回收
     */

    /**
     * newScheduledThreadPool
     * 创建一个 可以指定线程的数量 的线程池，但是这个线程池还带有
     * 延迟和周期性执行任务的功能，类似定时器
     */

    /**
     * 上面提到的四种线程池的构建，都是基于
     * Thread poolExecutor 来构建的，
     */



    /**
     *  初始化 3个大小的线程池
     */
    static ExecutorService service = Executors.newFixedThreadPool(3);



    @Override
    public void run() {

        try {
            Thread.sleep(100);
            System.out.println("线程id:  "+Thread.currentThread().getId()+"线程名称： "+Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        for (int i= 0;i< 100;i++){
            service.execute(new ThreadPoolTest());
        }

        service.shutdown();
    }


}
