package com.role.service;

import com.role.entity.Blog;

import java.util.List;

public interface BlogService {

    int add(Blog blog);
    int remove(Integer id);
    int update(Blog blog);
    Blog queryById(Integer id);
    List<Blog> queryByKeyWord(String keyword);
    List<Blog> findAll();
}
