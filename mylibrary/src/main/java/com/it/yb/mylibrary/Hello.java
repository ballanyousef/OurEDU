package com.it.yb.mylibrary;

public class Hello {
    private String msg;
    private String target;

    public Hello(String msg, String target) {
        this.msg = msg;
        this.target = target;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
