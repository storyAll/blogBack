package com.role.service;

import com.role.entity.User;

public interface UserService {

    /*
    * 登录账户密码验证
    * */
    public User queryForLogin(String username,String password);
}
