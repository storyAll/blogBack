package com.role.service.impl;

import com.role.dao.UserMapper;
import com.role.entity.User;
import com.role.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User queryForLogin(String username, String password) {

        return userMapper.queryForLogin(username,password);
    }

}
