package com.role.enums;

public enum UserEnum {
    USER_OK("成功",200),
    USER_ERR("用户名或密码错误",4001),
    USER_EXIST("用户已存在",4002);

    private String text;
    private int code;

    UserEnum(String text, int code) {
        this.text = text;
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "UserEnum{" +
                "text='" + text + '\'' +
                ", code=" + code +
                '}';
    }
}
