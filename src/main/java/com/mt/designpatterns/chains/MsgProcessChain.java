package com.mt.designpatterns.chains;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MT on 2019/6/17 0017 11:46
 * 客户端提供一个执行入口以及添加责任链的入口
 */
public class MsgProcessChain {

    private List<Process> chains = new ArrayList<>() ;


    /**
     * 添加责任链
     * @param process
     * @return
     */
    public MsgProcessChain addChain(Process process){
        chains.add(process) ;
        return this ;
    }

    /**
     * 执行处理
     * @param msg
     */
    public void process(String msg){
        for (Process chain : chains) {
            chain.doProcess(msg);
        }
    }




}
