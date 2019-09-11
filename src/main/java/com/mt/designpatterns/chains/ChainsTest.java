package com.mt.designpatterns.chains;

/**
 * Created by MT on 2019/6/17 0017 13:48
 * 责任链模式测试类
 */
public class ChainsTest {



    public static void main(String[] args) {
        String msg = "ceshi" ;
        MsgProcessChain chain = new MsgProcessChain()
                .addChain(new SensitiveWordProcess())
                .addChain(new Encryption())
                // 当我需要再增加一个处理逻辑时只需要添加一个处理单元即可
                // （addChain(Process process)），并对客户端 chain.process(msg) 是无感知的，不需要做任何的改动。
                .addChain(new CopyrightProcess()) ;
        chain.process(msg) ;
    }

}
