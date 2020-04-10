package com.epipe.parkcommon.entity;

/**
 * 统一错误代码
 * @author liyuexuan
 * @date 2019-04-10 09:57
 **/
public enum ErrorCode {

    /*认证，权限错误*/
    AUTH_FAIL(1001,"认证失败"),
    ;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }}
