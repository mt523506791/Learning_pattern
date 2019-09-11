package com.mt.designpatterns.chains.v2;

/**
 * @ClassName Process
 * @Description 责任链的真正处理函数接口
 * @Author maTao
 * @Date 2019/9/10 0010 下午 16:37
 **/
public interface Process {

    /**
     * 执行处理
     */
    void doProcess(String msg);


}
