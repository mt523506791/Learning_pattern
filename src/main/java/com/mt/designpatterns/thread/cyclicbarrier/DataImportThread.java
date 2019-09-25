package com.mt.designpatterns.thread.cyclicbarrier;

import javax.xml.soap.Node;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName DataImportThread
 * @Description
 * 当存在需要所有的子任务都完成时，才执行主任务，这个
 * 时候就可以选择使用 CyclicBarrier
 * @Author maTao
 * @Date 2019/9/25 0025 下午 14:24
 **/
public class DataImportThread extends Thread {

    private CyclicBarrier cyclicBarrier;
    private String path;

    public DataImportThread(CyclicBarrier cyclicBarrier,String path){
            this.cyclicBarrier = cyclicBarrier;
            this.path = path;


    }


    @Override
    public void run() {
        System.out.println("开始导入："+path+"位置的数据");
        try {
            // 阻塞
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }




}
