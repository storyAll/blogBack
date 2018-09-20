package com.role.controller;


import com.role.entity.User;
import com.role.enums.UserEnum;
import com.role.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService ;

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public Map<String,Object> login(String username,String password){

        Map map = new HashMap();
        User user=new User();
        user=userService.queryForLogin(username,password);
        if(user != null){
            map.put("code", UserEnum.USER_OK.getCode());
            map.put("msg", UserEnum.USER_OK.getText());
            map.put("token",true);
            map.put("data",user);
        }else{
            map.put("code",UserEnum.USER_ERR.getCode());
            map.put("msg", UserEnum.USER_ERR.getText());
            map.put("token",false);
            map.put("data",user);
        }
        return map;

    }


}

