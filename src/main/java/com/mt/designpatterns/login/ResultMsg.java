package com.mt.designpatterns.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ResultMsg
 * @Description
 * @Author maTao
 * @Date 2019/12/30 0030 下午 15:20
 **/
@Data // 提供类属性的get set 方法  equals toString hashCode 等方法
@NoArgsConstructor // 无参数构造
@AllArgsConstructor // 有参构造
public class ResultMsg {

    private int code;
    private String msg;
    private Object data;


}
