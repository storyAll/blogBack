package com.role.dao;

import com.role.entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class BlogMapperTest {

    @Autowired
    private BlogMapper blogMapper;


    @Test
    public void add() {
        Blog blog=new Blog();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        blog.setUsername("zc");
        blog.setTitle("test");
        blog.setContent("111aa11111");
        blog.setImgUrl("https://hdfasdghhfgasdfg.jpg");
        blog.setReleaseTime(f.format(new Date()));
        int result =blogMapper.add(blog);
        System.out.println(result);
    }

    @Test
    public void remove() {
        blogMapper.remove(1000);
    }

    @Test
    public void update() {
        Blog blog=new Blog();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        blog.setId(1001);
        blog.setUsername("admin");
        blog.setTitle("java");
        blog.setContent("HelloWorld");
        blog.setImgUrl("https://hdfasdghhfgasdfg.jpg");
        blog.setReleaseTime(f.format(new Date()));
        System.out.println(blogMapper.update(blog));
    }

    @Test
    public void queryById() {
    }

    @Test
    public void queryByKeyWord() {
        String keyword="a";
        System.out.println(blogMapper.queryByKeyWord(keyword));
    }

    @Test
    public void findAll() {

        System.out.println(blogMapper.findAll());
    }
}