package com.mt.designpatterns.threadpool;

import java.util.concurrent.*;

/**
 * @ClassName CallableDemo
 * @Description
 * @Author maTao
 * @Date 2019/9/27 0027 上午 11:13
 **/
public class CallableDemo implements Callable<String> {
    @Override
    public String call() throws Exception {

        // 模拟阻塞演示
        Thread.sleep(3000);

        return "hello mt";
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        CallableDemo callableDemo=new CallableDemo();

        Future future = executorService.submit(callableDemo);

        try {
            String str = (String) future.get();
            System.out.println("线程池返回结果:  ------>"+str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();

    }

}
