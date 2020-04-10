package com.epipe.parkcommon.entity;

/**
 * 通用返回模板
 * @author liyuexuan
 * @date 2019-04-09 15:28
 **/
public class Resp {

    private Resp.Header h;
    private Object b;

    public Resp() {
    }

    public Resp.Header getH() {
        if (this.h == null){
           this.h = new Resp.Header();
        }
        return this.h;
    }

    public void setH(Resp.Header h) {
        this.h = h;
    }

    public Object getB() {
        return this.b;
    }

    public void setB(Object b) {
        this.b = b;
    }

    public static Resp success(){
        Resp resp = new Resp();
        setHead(resp);
        return resp;
    }

    public static Resp success(Object data){
        Resp resp = new Resp();
        setHead(resp);
        resp.setB(data);
        return resp;
    }

    private static void setHead(Resp resp) {
        Header h = new Header();
        h.setCode(200);
        h.setMsg("操作成功");
        resp.setH(h);
    }

    public static Resp fail(ErrorCode errorCode){
        Resp resp = new Resp();
        Header h = new Resp.Header();
        h.setCode(errorCode.getCode());
        h.setMsg(errorCode.getMsg());
        resp.setH(h);
        return resp;
    }

    public static Resp fail(int code, String msg){
        Resp resp = new Resp();
        Header h = new Resp.Header();
        h.setCode(code);
        h.setMsg(msg);
        resp.setH(h);
        return resp;
    }

    public static class Header {
        private int code;
        private String msg;

        private Header() {
        }

        public int getCode() {
            return this.code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

    }

}
