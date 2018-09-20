package com.role.service.impl;

import com.role.dao.BlogMapper;
import com.role.entity.Blog;
import com.role.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public int add(Blog blog) {
        return blogMapper.add(blog);
    }

    @Override
    public int remove(Integer id) {
        return blogMapper.remove(id);
    }

    @Override
    public int update(Blog blog) {
        return blogMapper.update(blog);
    }

    @Override
    public Blog queryById(Integer id) {
        return blogMapper.queryById(id);
    }

    @Override
    public List<Blog> queryByKeyWord(String keyword) {
        return blogMapper.queryByKeyWord(keyword);
    }

    @Override
    public List<Blog> findAll() {
        return blogMapper.findAll();
    }
}
