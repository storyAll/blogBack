package com.role.enums;

public enum BlogEnum {
    SUCCESS("操作成功",200),
    FAIL("操作失败",-1);

    private String msg;
    private int code;

    BlogEnum(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Mesage{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                '}';
    }
}
