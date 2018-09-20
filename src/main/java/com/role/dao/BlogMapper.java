package com.role.dao;

import com.role.entity.Blog;

import java.util.List;

public interface BlogMapper {
    int add(Blog blog);
    int remove(Integer id);
    int update(Blog blog);
    Blog queryById(Integer id);
    List<Blog> queryByKeyWord(String keyword);
    List<Blog> findAll();
}
