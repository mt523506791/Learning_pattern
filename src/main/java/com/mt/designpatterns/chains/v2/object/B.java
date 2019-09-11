package com.mt.designpatterns.chains.v2.object;

import com.mt.designpatterns.chains.v2.Process;

/**
 * @ClassName B
 * @Description
 * @Author maTao
 * @Date 2019/9/10 0010 下午 16:40
 **/
public class B  implements Process {

    @Override
    public void doProcess(String msg) {
        if(msg.indexOf("B") !=-1){
            System.out.println("处理B");
        }
    }
}
