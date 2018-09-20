package com.role.controller;


import com.role.entity.Blog;
import com.role.enums.BlogEnum;
import com.role.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/blog")
@ResponseBody
public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping("/add")
    public Map<String ,Object> add(String username,String title,String content,String imgUrl){
        Map map = new HashMap();
        Blog blog = new Blog();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        blog.setUsername(username);
        blog.setTitle(title);
        blog.setContent(content);
        blog.setImgUrl(imgUrl);
        blog.setReleaseTime(f.format(new Date()));
        int result=blogService.add(blog);
        return this.setResponse(result,map);
    }

    @RequestMapping("/remove")
    public Map<String,Object> remove(int id){
        Map map =new HashMap();
        int result=blogService.remove(id);
        return this.setResponse(result,map);
    }

    @RequestMapping("/update")
    public Map<String,Object> update(int id, String username,String title,String content,String imgUrl){
        Map map =new HashMap();
        Blog blog = new Blog();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        blog.setId(id);
        blog.setUsername(username);
        blog.setTitle(title);
        blog.setContent(content);
        blog.setImgUrl(imgUrl);
        blog.setReleaseTime(f.format(new Date()));
        int result=blogService.update(blog);
        return this.setResponse(result,map);
    }

    @RequestMapping("/findAll")
    public Map<String,Object> findAll(){
        Map map =new HashMap();
        List<Blog> result=blogService.findAll();
        return this.setResponse(result,map);
    }

    @RequestMapping(value="/queryById",method = RequestMethod.POST)
    public Map<String,Object> queryById(int id){
        Map map =new HashMap();
        Blog result=blogService.queryById(id);
        return this.setResponse(result,map);
    }
    @RequestMapping("/queryByKeyWord")
    public Map<String,Object> queryByKeyWord(String keyword){
        Map map =new HashMap();
        List<Blog> result=blogService.queryByKeyWord(keyword);
        return this.setResponse(result,map);
    }

    private Map<String,Object> setResponse(int result,Map<String,Object> map){
        if(result>0){
            map.put("code", BlogEnum.SUCCESS.getCode());
            map.put("msg", BlogEnum.SUCCESS.getMsg());
        }else {
            map.put("code", BlogEnum.FAIL.getCode());
            map.put("msg", BlogEnum.FAIL.getMsg());
        }
        System.out.println(map);
        return map;
    }

    private Map<String,Object> setResponse(List<Blog> result, Map<String,Object> map){
        if(result.size()>=0){
            map.put("code", BlogEnum.SUCCESS.getCode());
            map.put("data", result);
        }else {
            map.put("code", BlogEnum.FAIL.getCode());
            map.put("msg", BlogEnum.FAIL.getMsg());
        }
        System.out.println(map);
        return map;
    }

    private Map<String,Object> setResponse(Blog result, Map<String,Object> map){
        if(result!=null){
            map.put("code", BlogEnum.SUCCESS.getCode());
            map.put("data", result);
        }else {
            map.put("code", BlogEnum.FAIL.getCode());
            map.put("msg", BlogEnum.FAIL.getMsg());
        }
        System.out.println(map);
        return map;
    }
}
