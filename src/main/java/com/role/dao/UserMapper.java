package com.role.dao;

import com.role.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User queryForLogin(@Param("username") String username, @Param("password") String password);
}
