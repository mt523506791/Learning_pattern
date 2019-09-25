package com.mt.designpatterns.thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName CycliBarrierDemo
 * @Description
 * @Author maTao
 * @Date 2019/9/25 0025 下午 14:29
 **/
public class CycliBarrierDemo extends Thread{


    @Override
    public void run() {
        System.out.println("开始进行数据分析");
    }

    public static void main(String[] args) {

        CyclicBarrier cycliBarrier = new CyclicBarrier(3,new CycliBarrierDemo());

        new Thread(new DataImportThread(cycliBarrier,"file1")).start();
        new Thread(new DataImportThread(cycliBarrier,"file2")).start();
        new Thread(new DataImportThread(cycliBarrier,"file3")).start();

    }

}
