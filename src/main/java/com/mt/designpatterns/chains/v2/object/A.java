package com.mt.designpatterns.chains.v2.object;

import com.mt.designpatterns.chains.v2.Process;

/**
 * @ClassName A
 * @Description
 * @Author maTao
 * @Date 2019/9/10 0010 下午 16:40
 **/
public class A implements Process {
    @Override
    public void doProcess(String msg) {
        if(msg.indexOf("A") !=-1){
            System.out.println("处理A");
        }
    }
}
