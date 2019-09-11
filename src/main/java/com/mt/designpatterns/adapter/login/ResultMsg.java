package com.mt.designpatterns.adapter.login;

import lombok.Data;

/**
 * Created by MT on 2019/6/18 0018 10:05
 */

@Data
public class ResultMsg {

    private int code;

    private String msg;

    private Object data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
