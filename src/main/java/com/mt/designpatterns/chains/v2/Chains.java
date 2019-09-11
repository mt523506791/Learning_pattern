package com.mt.designpatterns.chains.v2;

import sun.dc.pr.PRError;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Chains
 * @Description
 * @Author maTao
 * @Date 2019/9/10 0010 下午 16:43
 **/
public class Chains {

    // 装所有的责任链
    private  List<Process> list = new ArrayList<>();


    /**
     * 构造方法添加责任链
     * @param process
     * @return
     */
    public Chains add(Process process){
        list.add(process);
        return this;
    }

    /**
     * 执行处理
     */
    public void process(String msg){
        for(Process process : list){
            process.doProcess(msg);
        }

    }



}
