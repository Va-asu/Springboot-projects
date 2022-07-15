package com.example.Blog.Service;

import com.example.Blog.Model.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    Blog create(Blog blog);
    String delete(String id);
    String update(Blog blog);
    List<Blog> findall();

    Optional<Blog> findById(String id);
}
