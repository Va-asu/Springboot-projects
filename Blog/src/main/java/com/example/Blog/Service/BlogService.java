package com.example.Blog.Service;

import com.example.Blog.Model.Blog;

import java.util.List;

public interface BlogService {
    Blog create(Blog blog);
    String delete(String id);
    String update(Blog blog);
    List<Blog> findall();

    Blog findByTitle(String title);
}
